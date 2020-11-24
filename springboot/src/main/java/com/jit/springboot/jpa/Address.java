package com.jit.springboot.jpa;

public class Address {
	private String addressId;
	private String country;
	private String state;
	private String city;
	private String policeStation;
	private String street;
	private String nearBy;
	private String door;
	private String pincode;
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNearBy() {
		return nearBy;
	}
	public void setNearBy(String nearBy) {
		this.nearBy = nearBy;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", policeStation=" + policeStation + ", street=" + street + ", nearBy=" + nearBy + ", door=" + door
				+ ", pincode=" + pincode + "]";
	}
	
}
