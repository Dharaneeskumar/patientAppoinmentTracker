package com.appointmenttrackingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receptionistdetail")
public class ReceptionistDetail {


@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
int id;
@Column(name="receptionistName")
String receptionistName;
@Column(name="receptionistGender")
String receptionistGender;
@Id
@Column(name="receptionistEmail")
String receptionistEmail;
@Column(name="receptionistPassword")
String receptionistPassword;
@Column(name="receptionistNumber")
String receptionistNumber;
public ReceptionistDetail() {
	super();
	// TODO Auto-generated constructor stub
}

public ReceptionistDetail(String receptionistName, String receptionistGender, String receptionistEmail,
		String receptionistPassword, String receptionistNumber) {
	super();
	this.receptionistName = receptionistName;
	this.receptionistGender = receptionistGender;
	this.receptionistEmail = receptionistEmail;
	this.receptionistPassword = receptionistPassword;
	this.receptionistNumber = receptionistNumber;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return "ReceptionistDetail [id=" + id + ", receptionistName=" + receptionistName + ", receptionistGender="
			+ receptionistGender + ", receptionistEmail=" + receptionistEmail + ", receptionistPassword="
			+ receptionistPassword + ", receptionistNumber=" + receptionistNumber + "]";
}

}
