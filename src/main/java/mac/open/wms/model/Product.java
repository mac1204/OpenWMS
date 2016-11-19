package mac.open.wms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	@NotBlank
	private String skuCode;
	@NotBlank
	private String name;
	private Long categoryId;
	private Double basePrice;
	private Double maxRetailPrice;
	@NotBlank
	private String type;
	private String description;
	private String brand;
	private String productUrl;
	private String imageUrl;
	private String color;
	private String size;
	private Double volLength;
	private Double volBreadth;
	private Double volHeight;
	private String volUnit;
	private Double weight;
	private String weightUnit;
	private String scanableIdentifier;
	private Integer enabled;
	@Id
	@Column(name = "id")
	public Long getId() {
		return this.id;
	}
	@Column(name = "sku_code")
	public String getSkuCode() {
		return this.skuCode;
	}
	@Column(name = "name")
	public String getName() {
		return this.name;
	}
	@Column(name = "category_id")
	public Long getCategoryId() {
		return this.categoryId;
	}
	@Column(name = "base_price")
	public Double getBasePrice() {
		return this.basePrice;
	}
	@Column(name = "max_retail_price")
	public Double getMaxRetailPrice() {
		return this.maxRetailPrice;
	}
	@Column(name = "type")
	public String getType() {
		return this.type;
	}
	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}
	@Column(name = "brand")
	public String getBrand() {
		return this.brand;
	}
	@Column(name = "product_url")
	public String getProductUrl() {
		return this.productUrl;
	}
	@Column(name = "image_url")
	public String getImageUrl() {
		return this.imageUrl;
	}
	@Column(name = "color")
	public String getColor() {
		return this.color;
	}
	@Column(name = "size")
	public String getSize() {
		return this.size;
	}
	@Column(name = "vol_length")
	public Double getVolLength() {
		return this.volLength;
	}
	@Column(name = "vol_breadth")
	public Double getVolBreadth() {
		return this.volBreadth;
	}
	@Column(name = "vol_height")
	public Double getVolHeight() {
		return this.volHeight;
	}
	@Column(name = "vol_unit")
	public String getVolUnit() {
		return this.volUnit;
	}
	@Column(name = "weight")
	public Double getWeight() {
		return this.weight;
	}
	@Column(name = "weight_unit")
	public String getWeightUnit() {
		return this.weightUnit;
	}
	@Column(name = "scanable_identifier")
	public String getScanableIdentifier() {
		return this.scanableIdentifier;
	}
	@Column(name = "enabled")
	public Integer getEnabled() {
		return this.enabled;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public void setMaxRetailPrice(Double maxRetailPrice) {
		this.maxRetailPrice = maxRetailPrice;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setVolLength(Double volLength) {
		this.volLength = volLength;
	}
	public void setVolBreadth(Double volBreadth) {
		this.volBreadth = volBreadth;
	}
	public void setVolHeight(Double volHeight) {
		this.volHeight = volHeight;
	}
	public void setVolUnit(String volUnit) {
		this.volUnit = volUnit;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	public void setScanableIdentifier(String scanableIdentifier) {
		this.scanableIdentifier = scanableIdentifier;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
}