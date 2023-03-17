package com.appointmenttrackingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctordetail")
public class DoctorDetail {


@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
int id;
@Column(name="doctorName")
String doctorName;
@Column(name="doctorGender")
String doctorGender;
@Id
@Column(name="doctorEmail")
String doctorEmail;
@Column(name="doctorPassword")
String doctorPassword;
@Column(name="doctorSpecliest")
String doctorSpecliest;
public DoctorDetail(String doctorName, String doctorGender, String doctorEmail, String doctorPassword,
		String doctorSpecliest) {
	super();
	this.doctorName = doctorName;
	this.doctorGender = doctorGender;
	this.doctorEmail = doctorEmail;
	this.doctorPassword = doctorPassword;
	this.doctorSpecliest = doctorSpecliest;
}
public DoctorDetail() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return "DoctorDetail [id=" + id + ", doctorName=" + doctorName + ", doctorGender=" + doctorGender + ", doctorEmail="
			+ doctorEmail + ", doctorPassword=" + doctorPassword + ", doctorSpecliest=" + doctorSpecliest + "]";
}

}
