package com.appointmenttrackingsystem.Model;

import org.springframework.stereotype.Component;

@Component
public class AdminModel {

String adminName;
String adminGender;
String adminEmail;
String adminPassword;
public AdminModel(String adminName, String adminGender, String adminEmail, String adminPassword) {
	super();
	this.adminName = adminName;
	this.adminGender = adminGender;
	this.adminEmail = adminEmail;
	this.adminPassword = adminPassword;
}
public AdminModel() {
	super();
	// TODO Auto-generated constructor stub
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
	return "AdminModel [adminName=" + adminName + ", adminGender=" + adminGender + ", adminEmail=" + adminEmail
			+ ", adminPassword=" + adminPassword + "]";
}	
	
}