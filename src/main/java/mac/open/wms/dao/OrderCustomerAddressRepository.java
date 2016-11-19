package mac.open.wms.dao;

import java.util.List;

import mac.open.wms.model.OrderCustomerAddress;

import org.springframework.data.repository.CrudRepository;

public interface OrderCustomerAddressRepository extends CrudRepository<OrderCustomerAddress,Long>{
	public OrderCustomerAddress findOneById(Long id);
	public List<OrderCustomerAddress> findAllByOrderId(Long orderId);
}