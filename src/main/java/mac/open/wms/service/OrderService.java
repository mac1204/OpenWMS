package mac.open.wms.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mac.open.wms.model.Order;

public interface OrderService {
	
	Order getOrderByIdOrDisplayId(String orderCode);

	Order save(Order order);

	Page<Order> getAll(Pageable pageable);

}
