package mac.open.wms.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String code;
	private String details;
	private Long taxClassId;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "name")
	public String getName() {
		return this.name;
	}
	@Column(name = "code")
	public String getCode() {
		return this.code;
	}
	@Column(name = "details")
	public String getDetails() {
		return this.details;
	}
	@Column(name = "tax_class_id")
	public Long getTaxClassId() {
		return this.taxClassId;
	}
	@Column(name = "created_at")
	public Timestamp getCreatedAt() {
		return this.createdAt;
	}
	@Column(name = "updated_at")
	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setTaxClassId(Long taxClassId) {
		this.taxClassId = taxClassId;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}