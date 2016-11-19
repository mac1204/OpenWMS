package mac.open.wms.service.impl;

import java.util.List;

import mac.open.wms.dao.OrderItemRepository;
import mac.open.wms.model.OrderItem;
import mac.open.wms.service.OrderItemsService;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderItemsServiceImpl implements OrderItemsService {

	@Override
	public List<OrderItem> getItemsByOrderId(Long orderId) {
		return orderItemsRepository.findAllByOrderId(orderId);
	}
	
	@Override
	public List<OrderItem> saveAll(List<OrderItem> orderItems) {
		return (List<OrderItem>) orderItemsRepository.save(orderItems);
	}
	
	@Autowired
	OrderItemRepository orderItemsRepository;

}
