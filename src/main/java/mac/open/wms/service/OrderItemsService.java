package mac.open.wms.service;

import java.util.List;

import mac.open.wms.model.OrderItem;

public interface OrderItemsService {

	List<OrderItem> getItemsByOrderId(Long orderId);

	List<OrderItem> saveAll(List<OrderItem> orderItems);
}
