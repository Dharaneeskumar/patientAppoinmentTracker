package com.appointmenttrackingsystem.Model;

import org.springframework.stereotype.Component;

@Component
public class PatientModel {

String patientName;
String patientGender;
String patientEmail;
String patientPassword;
String patientProblem;
String aadarNumber;
String appointmentDate;
String age;
public PatientModel(String patientName, String patientGender, String patientEmail, String patientPassword,
		String patientProblem, String aadarNumber, String appointmentDate, String age) {
	super();
	this.patientName = patientName;
	this.patientGender = patientGender;
	this.patientEmail = patientEmail;
	this.patientPassword = patientPassword;
	this.patientProblem = patientProblem;
	this.aadarNumber = aadarNumber;
	this.appointmentDate = appointmentDate;
	this.age = age;
}
public PatientModel() {
	super();
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getPatientGender() {
	return patientGender;
}
public void setPatientGender(String patientGender) {
	this.patientGender = patientGender;
}
public String getPatientEmail() {
	return patientEmail;
}
public void setPatientEmail(String patientEmail) {
	this.patientEmail = patientEmail;
}
public String getPatientPassword() {
	return patientPassword;
}
public void setPatientPassword(String patientPassword) {
	this.patientPassword = patientPassword;
}
public String getPatientProblem() {
	return patientProblem;
}
public void setPatientProblem(String patientProblem) {
	this.patientProblem = patientProblem;
}
public String getAadarNumber() {
	return aadarNumber;
}
public void setAadarNumber(String aadarNumber) {
	this.aadarNumber = aadarNumber;
}
public String getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(String appointmentDate) {
	this.appointmentDate = appointmentDate;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
@Override
public String toString() {
	return "PatientModel [patientName=" + patientName + ", patientGender=" + patientGender + ", patientEmail="
			+ patientEmail + ", patientPassword=" + patientPassword + ", patientProblem=" + patientProblem
			+ ", aadarNumber=" + aadarNumber + ", appointmentDate=" + appointmentDate + ", age=" + age + "]";
}


}