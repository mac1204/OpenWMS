package mac.open.wms.service.impl;

import java.util.List;

import mac.open.wms.dao.OrderCustomerAddressRepository;
import mac.open.wms.model.OrderCustomerAddress;
import mac.open.wms.service.OrderCustomerAddressService;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderCustomerAddressServiceImpl implements OrderCustomerAddressService {

	@Override
	public List<OrderCustomerAddress> getCustomerAddressDetailsByOrderId(
			Long orderId) {
		return orderCustomerAddressRepository.findAllByOrderId(orderId);
	}
	
	@Override
	public List<OrderCustomerAddress> saveAll(List<OrderCustomerAddress> OrderCustomerAddresses) {
		return (List<OrderCustomerAddress>) orderCustomerAddressRepository.save(OrderCustomerAddresses);
	}
	
	@Autowired
	OrderCustomerAddressRepository orderCustomerAddressRepository;

}
