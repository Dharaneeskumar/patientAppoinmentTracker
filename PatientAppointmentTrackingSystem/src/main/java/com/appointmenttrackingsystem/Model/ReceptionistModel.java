package com.appointmenttrackingsystem.Model;

import org.springframework.stereotype.Component;

@Component
public class ReceptionistModel {

String receptionistName;
String receptionistGender;
String receptionistEmail;
String receptionistPassword;
String receptionistNumber;
public ReceptionistModel(String receptionistName, String receptionistGender, String receptionistEmail,
		String receptionistPassword, String receptionistNumber) {
	super();
	this.receptionistName = receptionistName;
	this.receptionistGender = receptionistGender;
	this.receptionistEmail = receptionistEmail;
	this.receptionistPassword = receptionistPassword;
	this.receptionistNumber = receptionistNumber;
}
public ReceptionistModel() {
	super();
	// TODO Auto-generated constructor stub
}
public String getReceptionistName() {
	return receptionistName;
}
public void setReceptionistName(String receptionistName) {
	this.receptionistName = receptionistName;
}
public String getReceptionistGender() {
	return receptionistGender;
}
public void setReceptionistGender(String receptionistGender) {
	this.receptionistGender = receptionistGender;
}
public String getReceptionistEmail() {
	return receptionistEmail;
}
public void setReceptionistEmail(String receptionistEmail) {
	this.receptionistEmail = receptionistEmail;
}
public String getReceptionistPassword() {
	return receptionistPassword;
}
public void setReceptionistPassword(String receptionistPassword) {
	this.receptionistPassword = receptionistPassword;
}
public String getReceptionistNumber() {
	return receptionistNumber;
}
public void setReceptionistNumber(String receptionistNumber) {
	this.receptionistNumber = receptionistNumber;
}
@Override
public String toString() {
	return "ReceptionistModel [receptionistName=" + receptionistName + ", receptionistGender=" + receptionistGender
			+ ", receptionistEmail=" + receptionistEmail + ", receptionistPassword=" + receptionistPassword
			+ ", receptionistNumber=" + receptionistNumber + "]";
}

}
