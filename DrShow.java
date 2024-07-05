package com.nt;

public class DrShow {
	
	
	private int id ;
	private String name ;
	private int contact ;
	private int experience ;
	private String degree;
	private String speciality ;
	private int fee;
	
	public DrShow() {
		
	}
	
	
	public DrShow ( int id , String name ,	 int contact ,	 int experience, 	 String degree,	String speciality 	, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.experience = experience;
		this.degree = degree;
		this.speciality = speciality;
		this.fee = fee;
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


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
