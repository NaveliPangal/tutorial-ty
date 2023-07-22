package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//it will create column directly by given name default
@Entity
public class userDetails {
	//primary key
	@Id
	//it will iterate further after one another
	@GeneratedValue(strategy= GenerationType.IDENTITY)
     private int id;
	
    //we assign column name manually for databases 
	@Column(name="Name")
     private String fullName;
     private String dob;
     private String email;
     private String gender;
     private String address;
     private String password;
    
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address =address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "userdetails [id=" + id + ", fullName=" + fullName + ", dob=" + dob + ", email=" + email + ",gender=" + gender +",address=" + address +" password="
				+ password + "]";
	}



}
