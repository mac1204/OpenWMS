package mac.open.wms.service;

import java.util.List;

import mac.open.wms.model.OrderCustomerAddress;

public interface OrderCustomerAddressService {
	
	List<OrderCustomerAddress> getCustomerAddressDetailsByOrderId(Long orderId);

	List<OrderCustomerAddress> saveAll(List<OrderCustomerAddress> orderCustomerAddressServices);

}
