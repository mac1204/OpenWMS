package mac.open.wms.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	private String orderCode;
	private String displayOrderCode;
	@NotBlank
	private String channel;
	private Timestamp orderDate;
	@NotBlank
	private String paymentMode;
	@NotBlank
	private String currency;
	private Long facilityCode;
	private String alternatePhone;
	private Timestamp assignedAt;
	private String assignedMgr;
	private String assignedTo;
	private String beginComment;
	private Double courierAmount;
	private String customerComments;
	private Double donationCharge;
	private Double emiCharge;
	private Double refundAmountOffline;
	private Double refundAmountOnline;
	private Double refundAmountWallet;
	private Timestamp refundDate;
	private String refundReason;
	private String finishComment;
	private Timestamp finishTime;
	private String finsihUser;
	private String franchiseCode;
	private String giftFrom;
	private String giftTo;
	private String franchiseCustomerCode;
	@NotBlank
	private String paymentMethod;
	private String oldOrderCode;
	private Timestamp holdBeginTime;
	private String holdUser;
	private String orderType;
	private Integer paymentCapture;
	private Double serviceCharge;
	private Integer specialOrderFlag;
	private Long storeId;
	private String team;
	private Double voucherValue;
	@NotBlank
	private String orderStatusStore;
	@NotBlank
	private String status;
	private Double amount;
	private Integer multipleAddress;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "order_code")
	public String getOrderCode() {
		return this.orderCode;
	}
	@Column(name = "display_order_code")
	public String getDisplayOrderCode() {
		return this.displayOrderCode;
	}
	@Column(name = "channel")
	public String getChannel() {
		return this.channel;
	}
	@Column(name = "order_date")
	public Timestamp getOrderDate() {
		return this.orderDate;
	}
	@Column(name = "payment_mode")
	public String getPaymentMode() {
		return this.paymentMode;
	}
	@Column(name = "currency")
	public String getCurrency() {
		return this.currency;
	}
	@Column(name = "facility_code")
	public Long getFacilityCode() {
		return this.facilityCode;
	}
	@Column(name = "alternate_phone")
	public String getAlternatePhone() {
		return this.alternatePhone;
	}
	@Column(name = "assigned_at")
	public Timestamp getAssignedAt() {
		return this.assignedAt;
	}
	@Column(name = "assigned_mgr")
	public String getAssignedMgr() {
		return this.assignedMgr;
	}
	@Column(name = "assigned_to")
	public String getAssignedTo() {
		return this.assignedTo;
	}
	@Column(name = "begin_comment")
	public String getBeginComment() {
		return this.beginComment;
	}
	@Column(name = "courier_amount")
	public Double getCourierAmount() {
		return this.courierAmount;
	}
	@Column(name = "customer_comments")
	public String getCustomerComments() {
		return this.customerComments;
	}
	@Column(name = "donation_charge")
	public Double getDonationCharge() {
		return this.donationCharge;
	}
	@Column(name = "emi_charge")
	public Double getEmiCharge() {
		return this.emiCharge;
	}
	@Column(name = "refund_amount_offline")
	public Double getRefundAmountOffline() {
		return this.refundAmountOffline;
	}
	@Column(name = "refund_amount_online")
	public Double getRefundAmountOnline() {
		return this.refundAmountOnline;
	}
	@Column(name = "refund_amount_wallet")
	public Double getRefundAmountWallet() {
		return this.refundAmountWallet;
	}
	@Column(name = "refund_date")
	public Timestamp getRefundDate() {
		return this.refundDate;
	}
	@Column(name = "refund_reason")
	public String getRefundReason() {
		return this.refundReason;
	}
	@Column(name = "finish_comment")
	public String getFinishComment() {
		return this.finishComment;
	}
	@Column(name = "finish_time")
	public Timestamp getFinishTime() {
		return this.finishTime;
	}
	@Column(name = "finsih_user")
	public String getFinsihUser() {
		return this.finsihUser;
	}
	@Column(name = "franchise_code")
	public String getFranchiseCode() {
		return this.franchiseCode;
	}
	@Column(name = "gift_from")
	public String getGiftFrom() {
		return this.giftFrom;
	}
	@Column(name = "gift_to")
	public String getGiftTo() {
		return this.giftTo;
	}
	@Column(name = "franchise_customer_code")
	public String getFranchiseCustomerCode() {
		return this.franchiseCustomerCode;
	}
	@Column(name = "payment_method")
	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	@Column(name = "old_order_code")
	public String getOldOrderCode() {
		return this.oldOrderCode;
	}
	@Column(name = "hold_begin_time")
	public Timestamp getHoldBeginTime() {
		return this.holdBeginTime;
	}
	@Column(name = "hold_user")
	public String getHoldUser() {
		return this.holdUser;
	}
	@Column(name = "order_type")
	public String getOrderType() {
		return this.orderType;
	}
	@Column(name = "payment_capture")
	public Integer getPaymentCapture() {
		return this.paymentCapture;
	}
	@Column(name = "service_charge")
	public Double getServiceCharge() {
		return this.serviceCharge;
	}
	@Column(name = "special_order_flag")
	public Integer getSpecialOrderFlag() {
		return this.specialOrderFlag;
	}
	@Column(name = "store_id")
	public Long getStoreId() {
		return this.storeId;
	}
	@Column(name = "team")
	public String getTeam() {
		return this.team;
	}
	@Column(name = "voucher_value")
	public Double getVoucherValue() {
		return this.voucherValue;
	}
	@Column(name = "order_status_store")
	public String getOrderStatusStore() {
		return this.orderStatusStore;
	}
	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}
	@Column(name = "amount")
	public Double getAmount() {
		return this.amount;
	}
	@Column(name = "multiple_address")
	public Integer getMultipleAddress() {
		return this.multipleAddress;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public void setDisplayOrderCode(String displayOrderCode) {
		this.displayOrderCode = displayOrderCode;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setFacilityCode(Long facilityCode) {
		this.facilityCode = facilityCode;
	}
	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}
	public void setAssignedAt(Timestamp assignedAt) {
		this.assignedAt = assignedAt;
	}
	public void setAssignedMgr(String assignedMgr) {
		this.assignedMgr = assignedMgr;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public void setBeginComment(String beginComment) {
		this.beginComment = beginComment;
	}
	public void setCourierAmount(Double courierAmount) {
		this.courierAmount = courierAmount;
	}
	public void setCustomerComments(String customerComments) {
		this.customerComments = customerComments;
	}
	public void setDonationCharge(Double donationCharge) {
		this.donationCharge = donationCharge;
	}
	public void setEmiCharge(Double emiCharge) {
		this.emiCharge = emiCharge;
	}
	public void setRefundAmountOffline(Double refundAmountOffline) {
		this.refundAmountOffline = refundAmountOffline;
	}
	public void setRefundAmountOnline(Double refundAmountOnline) {
		this.refundAmountOnline = refundAmountOnline;
	}
	public void setRefundAmountWallet(Double refundAmountWallet) {
		this.refundAmountWallet = refundAmountWallet;
	}
	public void setRefundDate(Timestamp refundDate) {
		this.refundDate = refundDate;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public void setFinishComment(String finishComment) {
		this.finishComment = finishComment;
	}
	public void setFinishTime(Timestamp finishTime) {
		this.finishTime = finishTime;
	}
	public void setFinsihUser(String finsihUser) {
		this.finsihUser = finsihUser;
	}
	public void setFranchiseCode(String franchiseCode) {
		this.franchiseCode = franchiseCode;
	}
	public void setGiftFrom(String giftFrom) {
		this.giftFrom = giftFrom;
	}
	public void setGiftTo(String giftTo) {
		this.giftTo = giftTo;
	}
	public void setFranchiseCustomerCode(String franchiseCustomerCode) {
		this.franchiseCustomerCode = franchiseCustomerCode;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void setOldOrderCode(String oldOrderCode) {
		this.oldOrderCode = oldOrderCode;
	}
	public void setHoldBeginTime(Timestamp holdBeginTime) {
		this.holdBeginTime = holdBeginTime;
	}
	public void setHoldUser(String holdUser) {
		this.holdUser = holdUser;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public void setPaymentCapture(Integer paymentCapture) {
		this.paymentCapture = paymentCapture;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setSpecialOrderFlag(Integer specialOrderFlag) {
		this.specialOrderFlag = specialOrderFlag;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setVoucherValue(Double voucherValue) {
		this.voucherValue = voucherValue;
	}
	public void setOrderStatusStore(String orderStatusStore) {
		this.orderStatusStore = orderStatusStore;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setMultipleAddress(Integer multipleAddress) {
		this.multipleAddress = multipleAddress;
	}
}