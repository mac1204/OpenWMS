package mac.open.wms.controller;

import mac.open.wms.model.Order;
import mac.open.wms.model.OrderDetail;
import mac.open.wms.service.OrderDetailService;
import mac.open.wms.service.OrderService;
import mac.open.wms.util.CommonUtils;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Mahak</br>
 *         This is a Controller which control all order related things</br>
 */
@Api(name = "Order APIs", description = "API which control all order related things", group = "Order API")
@ApiVersion(since = "1.0", until = "2.0")
@RequestMapping(value = "/order")
@RestController
public class OrderController {

	/**
	 * 
	 * @param orderCode
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/{order_code}", method = RequestMethod.GET)
	public @ApiResponseObject OrderDetail getOrderDetail(@ApiBodyObject @PathVariable("order_code") String orderCode) throws Exception {
		if(StringUtils.isBlank(orderCode)) {
			logger.error("order code is Empty.");
			throw new Exception("order code is Empty.");
		}
		return orderDetailService.getOrderByIdOrDisplayId(orderCode);
		
	}
	
	/**
	 * 
	 * @param orderDetail
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ApiResponseObject OrderDetail saveOrderDetail(@ApiBodyObject @RequestBody OrderDetail orderDetail) throws Exception {
		if(CommonUtils.isBlank(orderDetail)) {
			logger.error("order details is Empty.");
			throw new Exception("order details is Empty.");
		}
		if(CommonUtils.isBlank(orderDetail.getOrder())) {
			logger.error("orderDetails does not conatins key 'order'.");
			throw new Exception("orderDetails does not conatins key 'order'.");
		}
		if(CommonUtils.isBlank(orderDetail.getOrderCustomerAddresses())) {
			logger.error("orderDetails does not conatins key 'addresses'.");
			throw new Exception("orderDetails does not conatins  key 'addresses'.");
		}
		if(CommonUtils.isBlank(orderDetail.getOrderItems())) {
			logger.error("orderDetails does not conatins key 'items'.");
			throw new Exception("orderDetails does not conatins  key 'items'.");
		}
		return orderDetailService.save(orderDetail);
	}
	
	/**
	 * 
	 * @param pageable
	 * @return
	 * @throws Exception
	 */
	@ApiMethod
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ApiResponseObject Page<Order> list(@ApiBodyObject Pageable pageable) throws Exception {
		
		return orderService.getAll(pageable);
	}
	
	private Logger logger = Logger.getLogger(OrderController.class.getName());

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderDetailService orderDetailService;
}