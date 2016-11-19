package mac.open.wms.model;

import java.util.List;

public class ShipmentDetail {
	
	private Shipment shipment;
	private List<OrderItem> orderItems;
	
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
