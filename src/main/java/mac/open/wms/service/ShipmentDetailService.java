package mac.open.wms.service;

import mac.open.wms.model.ShipmentDetail;

public interface ShipmentDetailService {

	ShipmentDetail getShipmentDetail(String shipmentCode) throws Exception;

}
