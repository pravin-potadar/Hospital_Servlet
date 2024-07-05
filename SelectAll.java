package com.nt;

public class SelectAll {
	
	private  int id ;
	private String name ;
	private int contact ;
	private String address ;
	private String gender;
	private int age ;
	private String allergy ;
	
	
	
	public SelectAll() {
	
	}
	
	public SelectAll(int id, String name, int contact, String address, String gender, int age,
			String allergy) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.allergy = allergy;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

}
