package mac.open.wms.service;

import mac.open.wms.model.OrderDetail;

public interface OrderDetailService {
	
	public OrderDetail getOrderByIdOrDisplayId(String orderCode) throws Exception;

	public OrderDetail save(OrderDetail orderDetail) throws Exception;
	
}
