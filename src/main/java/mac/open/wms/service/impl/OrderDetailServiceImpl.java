package mac.open.wms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mac.open.wms.model.Order;
import mac.open.wms.model.OrderCustomerAddress;
import mac.open.wms.model.OrderDetail;
import mac.open.wms.model.OrderItem;
import mac.open.wms.service.OrderCustomerAddressService;
import mac.open.wms.service.OrderDetailService;
import mac.open.wms.service.OrderItemsService;
import mac.open.wms.service.OrderService;

public class OrderDetailServiceImpl implements OrderDetailService{

	@Override
	public OrderDetail getOrderByIdOrDisplayId(String orderCode) throws Exception {
		OrderDetail orderDetail = new OrderDetail();
		Order order = orderService.getOrderByIdOrDisplayId(orderCode);
		if(order == null) {
			throw new Exception("order not found for given orderCode -- " + orderCode);
		}
		orderDetail.setOrder(order);
		orderDetail.setOrderCustomerAddresses(orderCustomerAddressService.getCustomerAddressDetailsByOrderId(order.getId()));
		orderDetail.setOrderItems(orderItemsService.getItemsByOrderId(order.getId()));
		return orderDetail;
	}
	
	@Override
	@Transactional
	public OrderDetail save(OrderDetail orderDetail) throws Exception {
		OrderDetail result = new OrderDetail();
		List<OrderItem> orderItems = orderDetail.getOrderItems();
		List<OrderCustomerAddress> orderCustomerAddresses = orderDetail.getOrderCustomerAddresses();
		Order order = orderService.save(orderDetail.getOrder());
		
		for(OrderCustomerAddress orderCustomerAddress : orderCustomerAddresses){
			orderCustomerAddress.setOrderId(order.getId());
		}
		orderCustomerAddresses = orderCustomerAddressService.saveAll(orderCustomerAddresses);
		List<OrderItem> finalorderItems = new ArrayList<OrderItem>();
		Double totalAmount = 0.0;
		for(OrderItem orderItem : orderItems){
			orderItem.setOrderId(order.getId());
			Double units = orderItem.getUnits().doubleValue();
			Double sellingPrice = orderItem.getSellingPrice();
			totalAmount = totalAmount + sellingPrice;
			if(units < 1){
				logger.error("Order has items with unit 0. DispalyOrderCode - " + order.getDisplayOrderCode());
				continue;
			}
			if(units.equals(1)) {
				finalorderItems.add(orderItem);
			} else {
				for(int i = 0; i < units; i++) {
					orderItem.setUnits(1L);
					orderItem.setSellingPrice(sellingPrice/units);
					finalorderItems.add(orderItem);
				}
			}
		}
		if(totalAmount.equals(order.getAmount())) {
			logger.error("Order has amount mismatch - " + order.getDisplayOrderCode());
			throw new Exception("Order has amount mismatch - " + order.getDisplayOrderCode());
		}
		orderItems = orderItemsService.saveAll(orderItems);
		
		result.setOrder(order);;
		result.setOrderCustomerAddresses(orderCustomerAddresses);
		result.setOrderItems(orderItems);
		return result;
	}
	
	private Logger logger = Logger.getLogger(OrderDetailServiceImpl.class.getName());
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderCustomerAddressService orderCustomerAddressService;
	
	@Autowired
	private OrderItemsService orderItemsService;

}
