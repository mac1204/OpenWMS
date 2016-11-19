package mac.open.wms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import mac.open.wms.dao.ShipmentRepository;
import mac.open.wms.model.Shipment;
import mac.open.wms.service.ShipmentService;
import mac.open.wms.util.CommonUtils;

public class ShipementServiceImpl implements ShipmentService{

	@Override
	public Page<Shipment> getAll(Pageable pageable) {
		
		if(null == pageable) {
			pageable = new PageRequest(0, 100);
		}
		return shipmentRepository.findAll(pageable);
	}
	
	@Override
	public Shipment getShipmentByIdOrShipmentOrderCodeorDisplayOrderCode(String shipmentCode) throws Exception {
		Shipment shipment = new Shipment();
		if(CommonUtils.isLong(shipmentCode)) {
			shipment = shipmentRepository.findOneById(Long.parseLong(shipmentCode));
		} else {
			shipment = shipmentRepository.findOneByShipmentCode(shipmentCode);
			if(CommonUtils.isBlank(shipment)) {
				shipment = shipmentRepository.findTopByDisplayOrderCodeOrderByIdDesc(shipmentCode);
			}
		}
		return shipment;
	}
	
	@Autowired
	private ShipmentRepository shipmentRepository;

}
