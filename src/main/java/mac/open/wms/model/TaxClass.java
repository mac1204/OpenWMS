package mac.open.wms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "tax_classes")
public class TaxClass implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	private String name;
	private Double priceBegin;
	private Double priceEnd;
	private Integer vatPercent;
	private Integer cstPercent;
	private Integer cstFormCPercent;
	private Integer additionalTax;
	@NotBlank
	private String stateCode;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "name")
	public String getName() {
		return this.name;
	}
	@Column(name = "price_begin")
	public Double getPriceBegin() {
		return this.priceBegin;
	}
	@Column(name = "price_end")
	public Double getPriceEnd() {
		return this.priceEnd;
	}
	@Column(name = "vat_percent")
	public Integer getVatPercent() {
		return this.vatPercent;
	}
	@Column(name = "cst_percent")
	public Integer getCstPercent() {
		return this.cstPercent;
	}
	@Column(name = "cst_form_c_percent")
	public Integer getCstFormCPercent() {
		return this.cstFormCPercent;
	}
	@Column(name = "additional_tax")
	public Integer getAdditionalTax() {
		return this.additionalTax;
	}
	@Column(name = "state_code")
	public String getStateCode() {
		return this.stateCode;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPriceBegin(Double priceBegin) {
		this.priceBegin = priceBegin;
	}
	public void setPriceEnd(Double priceEnd) {
		this.priceEnd = priceEnd;
	}
	public void setVatPercent(Integer vatPercent) {
		this.vatPercent = vatPercent;
	}
	public void setCstPercent(Integer cstPercent) {
		this.cstPercent = cstPercent;
	}
	public void setCstFormCPercent(Integer cstFormCPercent) {
		this.cstFormCPercent = cstFormCPercent;
	}
	public void setAdditionalTax(Integer additionalTax) {
		this.additionalTax = additionalTax;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
}