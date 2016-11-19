package mac.open.wms.controller;

import mac.open.wms.model.Shipment;
import mac.open.wms.model.ShipmentDetail;
import mac.open.wms.service.ShipmentDetailService;
import mac.open.wms.service.ShipmentService;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiBodyObject;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.annotation.ApiVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Mahak</br>
 *         This is a Controller which control all order related things</br>
 */
@Api(name = "Shipment APIs", description = "API which control all shipment related things", group = "Order API")
@ApiVersion(since = "1.0", until = "2.0")
@RequestMapping(value = "/shipment")
@RestController
public class ShipmentController {
	
	/**
	 * 
	 * @param pageable
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ApiResponseObject Page<Shipment> list(@ApiBodyObject Pageable pageable) throws Exception {
		
		return shipmentService.getAll(pageable);
	}
	
	/**
	 * 
	 * @param shipmentCode
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/{shipment_code}", method = RequestMethod.GET)
	public @ApiResponseObject ShipmentDetail getShipmentDetail(@ApiBodyObject @PathVariable("shipment_code") String shipmentCode) throws Exception {
		if(StringUtils.isBlank(shipmentCode)) {
			logger.error("Pathvariable shipment code is empty.");
			throw new Exception("Pathvariable shipment code is empty.");
		}
		return shipmentDetailService.getShipmentDetail(shipmentCode);
	}
	
	private Logger logger = Logger.getLogger(ShipmentController.class.getName());

	@Autowired
	private ShipmentService shipmentService;
	
	@Autowired
	private ShipmentDetailService shipmentDetailService;
	
}