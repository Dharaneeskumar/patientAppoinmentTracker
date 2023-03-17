package com.appointmenttrackingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admindetail")
public class AdminDetail {


@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
int id;
@Column(name="adminName")
String adminName;
@Column(name="adminGender")
String adminGender;
@Id
@Column(name="adminEmail")
String adminEmail;
@Column(name="adminPassword")
String adminPassword;
public AdminDetail( String adminName, String adminGender, String adminEmail, String adminPassword) {
	super();
	this.adminName = adminName;
	this.adminGender = adminGender;
	this.adminEmail = adminEmail;
	this.adminPassword = adminPassword;
}
public AdminDetail() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getAdminGender() {
	return adminGender;
}
public void setAdminGender(String adminGender) {
	this.adminGender = adminGender;
}
public String getAdminEmail() {
	return adminEmail;
}
public void setAdminEmail(String adminEmail) {
	this.adminEmail = adminEmail;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
@Override
public String toString() {
	return "AdminDetail [id=" + id + ", adminName=" + adminName + ", adminGender=" + adminGender + ", adminEmail="
			+ adminEmail + ", adminPassword=" + adminPassword + "]";
}


}
