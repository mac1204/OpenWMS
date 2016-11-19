package mac.open.wms.model;

import java.util.List;

public class OrderDetail {
	
	private Order order;
	private List<OrderCustomerAddress> orderCustomerAddresses;
	private List<OrderItem> orderItems;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderCustomerAddress> getOrderCustomerAddresses() {
		return orderCustomerAddresses;
	}
	public void setOrderCustomerAddresses(List<OrderCustomerAddress> orderCustomerAddresses) {
		this.orderCustomerAddresses = orderCustomerAddresses;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
