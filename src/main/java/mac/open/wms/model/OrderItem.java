package mac.open.wms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "order_items")
public class OrderItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long orderId;
	private Long productId;
	private Integer isFulfillable;
	@NotBlank
	private String shipmentCode;
	private Double sellingPrice;
	private Long units;
	@NotBlank
	private String status;
	@NotBlank
	private String barcode;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "order_id")
	public Long getOrderId() {
		return this.orderId;
	}
	@Column(name = "product_id")
	public Long getProductId() {
		return this.productId;
	}
	@Column(name = "is_fulfillable")
	public Integer getIsFulfillable() {
		return this.isFulfillable;
	}
	@Column(name = "shipment_code")
	public String getShipmentCode() {
		return this.shipmentCode;
	}
	@Column(name = "selling_price")
	public Double getSellingPrice() {
		return this.sellingPrice;
	}
	@Column(name = "units")
	public Long getUnits() {
		return this.units;
	}
	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}
	@Column(name = "barcode")
	public String getBarcode() {
		return this.barcode;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public void setIsFulfillable(Integer isFulfillable) {
		this.isFulfillable = isFulfillable;
	}
	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public void setUnits(Long units) {
		this.units = units;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
}