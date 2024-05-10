package com.app.core;

import java.time.LocalDate;

public class Phone {
	private int phoneNumber;
	private String name;	
	private LocalDate dob;
	private String email;
	public Phone(int phoneNumber, String name, LocalDate date, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", name=" + name + ", dob=" + dob + ", email=" + email + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Phone) {
			Phone ph=(Phone)o;
			return this.email.equals(email)&&this.dob.equals(dob);
		}
		return false;
	}
	
	public int hashCode() {
		return email.hashCode()+dob.hashCode();	
	}
	
	
}
