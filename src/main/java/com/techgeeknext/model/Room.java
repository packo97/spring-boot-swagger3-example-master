package com.techgeeknext.model;

import java.util.Objects;

public class Room {

	private int roomNumber;

	private String roomType;

	private String amenities;
	
	private int price;

	private String photos;
	
	private String checkinTime;
	
	private String checkoutTime;
	
	private Double rating;
	
	
	

	public Room(int roomNumber, String roomType, String amenities, int price, String photos, String checkinTime,
			String checkoutTime, Double rating) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.amenities = amenities;
		this.price = price;
		this.photos = photos;
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
		this.rating = rating;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(String checkinTime) {
		this.checkinTime = checkinTime;
	}

	public String getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(String checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amenities, checkinTime, checkoutTime, photos, price, rating, roomNumber, roomType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(amenities, other.amenities) && Objects.equals(checkinTime, other.checkinTime)
				&& Objects.equals(checkoutTime, other.checkoutTime) && Objects.equals(photos, other.photos)
				&& price == other.price && rating == other.rating && roomNumber == other.roomNumber
				&& Objects.equals(roomType, other.roomType);
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", amenities=" + amenities + ", price="
				+ price + ", photos=" + photos + ", checkinTime=" + checkinTime + ", checkoutTime=" + checkoutTime
				+ ", rating=" + rating + "]";
	}

	
	
	
}
