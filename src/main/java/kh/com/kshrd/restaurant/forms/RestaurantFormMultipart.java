package kh.com.kshrd.restaurant.forms;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantFormMultipart {
	
	@JsonIgnore
	private Long id;
	
	@JsonProperty(value="NAME")
	@NotNull
	@NotEmpty
	private String name;
	
	@JsonProperty(value="DESCRIPTION")
	private String description;
	
	@JsonProperty(value="ADDRESS")
	private String address;
	
	@JsonProperty(value="IS_DELIVERY")
	@Size(max=1)
	private String isDelivery;
	
	@JsonProperty(value="STATUS")
	@Size(max=1)
	private String status;
	
	@JsonProperty(value="MENU_IMAGES")
	@NotNull
	@NotEmpty
	List<CommonsMultipartFile> menuImages;
	
	@JsonProperty(value="RESTAURANT_IMAGES")
	@NotNull
	@NotEmpty
	List<CommonsMultipartFile> restaurantImages;
	
	@JsonProperty(value="RESTAURANT_CATEGORY")
	@NotNull
	@NotEmpty
	private String restaurantCategory;
	
	@JsonProperty(value="LATITUDE")
	@NotNull
	@NotEmpty
	private String latitude;
	
	@JsonProperty(value="LONGITUDE")
	@NotNull
	@NotEmpty
	private String longitude;
	
	@JsonProperty(value="TELEPHONE")
	@NotNull
	@NotEmpty
	private String telephone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsDelivery() {
		return isDelivery;
	}
	public void setIsDelivery(String isDelivery) {
		this.isDelivery = isDelivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<CommonsMultipartFile> getMenuImages() {
		return menuImages;
	}
	public void setMenuImages(List<CommonsMultipartFile> menuImages) {
		this.menuImages = menuImages;
	}
	public List<CommonsMultipartFile> getRestaurantImages() {
		return restaurantImages;
	}
	public void setRestaurantImages(List<CommonsMultipartFile> restaurantImages) {
		this.restaurantImages = restaurantImages;
	}
	
	public String getRestaurantCategory() {
		return restaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		this.restaurantCategory = restaurantCategory;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "RestaurantForm [id=" + id + ", name=" + name + ", description=" + description + ", address=" + address
				+ ", isDelivery=" + isDelivery + ", status=" + status + ", menuImages=" + menuImages
				+ ", restaurantImages=" + restaurantImages + ", restaurantCategory=" + restaurantCategory
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", telephone=" + telephone + "]";
	}
	
}