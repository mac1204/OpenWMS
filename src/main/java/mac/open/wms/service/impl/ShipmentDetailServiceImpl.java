package mac.open.wms.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mac.open.wms.dao.OrderItemRepository;
import mac.open.wms.model.OrderItem;
import mac.open.wms.model.Shipment;
import mac.open.wms.model.ShipmentDetail;
import mac.open.wms.service.ShipmentDetailService;
import mac.open.wms.service.ShipmentService;
import mac.open.wms.util.CommonUtils;

public class ShipmentDetailServiceImpl implements ShipmentDetailService{

	@Override
	public ShipmentDetail getShipmentDetail(String shipmentCode) throws Exception {
		ShipmentDetail shipmentDetail = new ShipmentDetail();
		Shipment shipment = shipmentService.getShipmentByIdOrShipmentOrderCodeorDisplayOrderCode(shipmentCode);
		if(CommonUtils.isBlank(shipment)) {
			logger.error("No Shipment found.");
			throw new Exception("No shipment found.");
		}
		shipmentDetail.setShipment(shipment);
		List<OrderItem> orderItems = orderItemRepository.findAllByShipmentCode(shipment.getShipmentCode());
		shipmentDetail.setOrderItems(orderItems);
		return shipmentDetail;
	}
	
	private Logger logger = Logger.getLogger(ShipmentDetailServiceImpl.class.getName());
	
	@Autowired
	private ShipmentService shipmentService;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

}
