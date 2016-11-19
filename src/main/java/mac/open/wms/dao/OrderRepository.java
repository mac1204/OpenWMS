package mac.open.wms.dao;

import java.util.List;
import java.sql.Timestamp;

import mac.open.wms.model.Order;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long>{
	public Order findOneById(Long id);
	public Order findOneByOrderCode(String orderCode);
	public Order findOneByDisplayOrderCode(String displayOrderCode);
	public List<Order> findAllByChannel(String channel);
	public List<Order> findAllByOrderDate(Timestamp orderDate);
	public List<Order> findAllByPaymentMode(String paymentMode);
	public List<Order> findAllByFacilityCode(Long facilityCode);
	public List<Order> findAllByAssignedMgr(String assignedMgr);
	public List<Order> findAllByAssignedTo(String assignedTo);
	public List<Order> findAllByPaymentMethod(String paymentMethod);
	public List<Order> findAllByOrderStatusStore(String orderStatusStore);
	public List<Order> findAllByStatus(String status);
	public List<Order> findAllByAmount(Double amount);
	public List<Order> findAllByMultipleAddress(Integer multipleAddress);
	public Page<Order> findAll(Pageable pageable);
}