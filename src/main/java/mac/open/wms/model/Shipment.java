package mac.open.wms.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "shipments")
public class Shipment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	private String shipmentCode;
	@NotBlank
	private String displayOrderCode;
	@NotBlank
	private String status;
	private Timestamp createdAt;
	private String invoiceNo;
	@NotBlank
	private String shipmentMethod;
	@NotBlank
	private String shipmentCarrier;
	@NotBlank
	private String awbNo;
	private Long itemsCount;
	private Long boxesCount;
	private String packageType;
	private Double weight;
	private Long picklistId;
	private Timestamp dispatchedDate;
	private String parentPackageCode;
	private String shipmentManifestCode;
	private String returnManifestCode;
	private String courierStatus;
	private Timestamp deliveryDate;
	private String zone;
	private String reshipmentOrderCode;
	private String customizationStatus;
	private String customizationAssignedTo;
	private String shelfCode;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "shipment_code")
	public String getShipmentCode() {
		return this.shipmentCode;
	}
	@Column(name = "display_order_code")
	public String getDisplayOrderCode() {
		return this.displayOrderCode;
	}
	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}
	@Column(name = "created_at")
	public Timestamp getCreatedAt() {
		return this.createdAt;
	}
	@Column(name = "invoice_no")
	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	@Column(name = "shipment_method")
	public String getShipmentMethod() {
		return this.shipmentMethod;
	}
	@Column(name = "shipment_carrier")
	public String getShipmentCarrier() {
		return this.shipmentCarrier;
	}
	@Column(name = "awb_no")
	public String getAwbNo() {
		return this.awbNo;
	}
	@Column(name = "items_count")
	public Long getItemsCount() {
		return this.itemsCount;
	}
	@Column(name = "boxes_count")
	public Long getBoxesCount() {
		return this.boxesCount;
	}
	@Column(name = "package_type")
	public String getPackageType() {
		return this.packageType;
	}
	@Column(name = "weight")
	public Double getWeight() {
		return this.weight;
	}
	@Column(name = "picklist_id")
	public Long getPicklistId() {
		return this.picklistId;
	}
	@Column(name = "dispatched_date")
	public Timestamp getDispatchedDate() {
		return this.dispatchedDate;
	}
	@Column(name = "parent_package_code")
	public String getParentPackageCode() {
		return this.parentPackageCode;
	}
	@Column(name = "shipment_manifest_code")
	public String getShipmentManifestCode() {
		return this.shipmentManifestCode;
	}
	@Column(name = "return_manifest_code")
	public String getReturnManifestCode() {
		return this.returnManifestCode;
	}
	@Column(name = "courier_status")
	public String getCourierStatus() {
		return this.courierStatus;
	}
	@Column(name = "delivery_date")
	public Timestamp getDeliveryDate() {
		return this.deliveryDate;
	}
	@Column(name = "zone")
	public String getZone() {
		return this.zone;
	}
	@Column(name = "reshipment_order_code")
	public String getReshipmentOrderCode() {
		return this.reshipmentOrderCode;
	}
	@Column(name = "customization_status")
	public String getCustomizationStatus() {
		return this.customizationStatus;
	}
	@Column(name = "customization_assigned_to")
	public String getCustomizationAssignedTo() {
		return this.customizationAssignedTo;
	}
	@Column(name = "shelf_code")
	public String getShelfCode() {
		return this.shelfCode;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}
	public void setDisplayOrderCode(String displayOrderCode) {
		this.displayOrderCode = displayOrderCode;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}
	public void setShipmentCarrier(String shipmentCarrier) {
		this.shipmentCarrier = shipmentCarrier;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}
	public void setBoxesCount(Long boxesCount) {
		this.boxesCount = boxesCount;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public void setPicklistId(Long picklistId) {
		this.picklistId = picklistId;
	}
	public void setDispatchedDate(Timestamp dispatchedDate) {
		this.dispatchedDate = dispatchedDate;
	}
	public void setParentPackageCode(String parentPackageCode) {
		this.parentPackageCode = parentPackageCode;
	}
	public void setShipmentManifestCode(String shipmentManifestCode) {
		this.shipmentManifestCode = shipmentManifestCode;
	}
	public void setReturnManifestCode(String returnManifestCode) {
		this.returnManifestCode = returnManifestCode;
	}
	public void setCourierStatus(String courierStatus) {
		this.courierStatus = courierStatus;
	}
	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public void setReshipmentOrderCode(String reshipmentOrderCode) {
		this.reshipmentOrderCode = reshipmentOrderCode;
	}
	public void setCustomizationStatus(String customizationStatus) {
		this.customizationStatus = customizationStatus;
	}
	public void setCustomizationAssignedTo(String customizationAssignedTo) {
		this.customizationAssignedTo = customizationAssignedTo;
	}
	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
	}
}