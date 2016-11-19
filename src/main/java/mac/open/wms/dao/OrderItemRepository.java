package mac.open.wms.dao;

import java.util.List;

import mac.open.wms.model.OrderItem;

import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem,Long>{
	public OrderItem findOneById(Long id);
	public List<OrderItem> findAllByOrderId(Long orderId);
	public List<OrderItem> findAllByProductId(Long productId);
	public List<OrderItem> findAllByShipmentCode(String shipmentCode);
}