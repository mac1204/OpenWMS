package mac.open.wms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "order_customer_address")
public class OrderCustomerAddress implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long orderId;
	private String customerName;
	private String phoneNo;
	private String emailId;
	private Long addressType;
	@NotBlank
	private String name;
	@NotBlank
	private String addressLine1;
	private String addressLine2;
	@NotBlank
	private String country;
	@NotBlank
	private String state;
	@NotBlank
	private String city;
	private Long pincode;
	@NotBlank
	private String addressPhoneNo;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "order_id")
	public Long getOrderId() {
		return this.orderId;
	}
	@Column(name = "customer_name")
	public String getCustomerName() {
		return this.customerName;
	}
	@Column(name = "phone_no")
	public String getPhoneNo() {
		return this.phoneNo;
	}
	@Column(name = "email_id")
	public String getEmailId() {
		return this.emailId;
	}
	@Column(name = "address_type")
	public Long getAddressType() {
		return this.addressType;
	}
	@Column(name = "name")
	public String getName() {
		return this.name;
	}
	@Column(name = "address_line_1")
	public String getAddressLine1() {
		return this.addressLine1;
	}
	@Column(name = "address_line_2")
	public String getAddressLine2() {
		return this.addressLine2;
	}
	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}
	@Column(name = "state")
	public String getState() {
		return this.state;
	}
	@Column(name = "city")
	public String getCity() {
		return this.city;
	}
	@Column(name = "pincode")
	public Long getPincode() {
		return this.pincode;
	}
	@Column(name = "address_phone_no")
	public String getAddressPhoneNo() {
		return this.addressPhoneNo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setAddressType(Long addressType) {
		this.addressType = addressType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public void setAddressPhoneNo(String addressPhoneNo) {
		this.addressPhoneNo = addressPhoneNo;
	}
}