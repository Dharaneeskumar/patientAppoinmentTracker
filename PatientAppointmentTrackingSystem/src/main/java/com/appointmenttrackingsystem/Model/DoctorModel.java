package com.appointmenttrackingsystem.Model;

import org.springframework.stereotype.Component;

@Component
public class DoctorModel {

String doctorName;
String doctorGender;
String doctorEmail;
String doctorPassword;
String doctorSpecliest;
public DoctorModel(String doctorName, String doctorGender, String doctorEmail, String doctorPassword,
		String doctorSpecliest) {
	super();
	this.doctorName = doctorName;
	this.doctorGender = doctorGender;
	this.doctorEmail = doctorEmail;
	this.doctorPassword = doctorPassword;
	this.doctorSpecliest = doctorSpecliest;
}
public DoctorModel() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDoctorGender() {
	return doctorGender;
}
public void setDoctorGender(String doctorGender) {
	this.doctorGender = doctorGender;
}
public String getDoctorEmail() {
	return doctorEmail;
}
public void setDoctorEmail(String doctorEmail) {
	this.doctorEmail = doctorEmail;
}
public String getDoctorPassword() {
	return doctorPassword;
}
public void setDoctorPassword(String doctorPassword) {
	this.doctorPassword = doctorPassword;
}
public String getDoctorSpecliest() {
	return doctorSpecliest;
}
public void setDoctorSpecliest(String doctorSpecliest) {
	this.doctorSpecliest = doctorSpecliest;
}
@Override
public String toString() {
	return "DoctorModel [doctorName=" + doctorName + ", doctorGender=" + doctorGender + ", doctorEmail=" + doctorEmail
			+ ", doctorPassword=" + doctorPassword + ", doctorSpecliest=" + doctorSpecliest + "]";
}



}