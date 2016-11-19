package mac.open.wms.service.impl;

import mac.open.wms.dao.OrderRepository;
import mac.open.wms.model.Order;
import mac.open.wms.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 
 * ProductBarcodeAuditServiceImpl.java
 * 
 * @since 0.7.0.0
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public Order getOrderByIdOrDisplayId(String orderCode) {

		Order order = orderRepository.findOneByOrderCode(orderCode);
		if(order == null) {
			return orderRepository.findOneByDisplayOrderCode(orderCode);
		}
		return order;
	}
	
	@Override
	public Order save(Order order) {
		return orderRepository.save(order);
	}
	
	@Override
	public Page<Order> getAll(Pageable pageable) {
		if(pageable == null) {
			pageable = new PageRequest(0, 100);
		}
		return orderRepository.findAll(pageable);
	}
	
		
	@Autowired
	private OrderRepository orderRepository;

}
