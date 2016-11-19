package mac.open.wms.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import mac.open.wms.model.Shipment;

public interface ShipmentService {

	Page<Shipment> getAll(Pageable pageable);

	Shipment getShipmentByIdOrShipmentOrderCodeorDisplayOrderCode(String shipmentCode) throws Exception;

}
