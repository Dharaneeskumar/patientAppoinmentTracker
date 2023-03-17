package com.appointmenttrackingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="patientdetail")
public class PatientDetail {


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="patientName")
	String patientName;
	@Column(name="patientGender")
	String patientGender;
	@Id
	@Column(name="patientEmail")
	String patientEmail;
	@Column(name="patientPassword")
	String patientPassword;
	@Column(name="patientProblem")
	String patientProblem;
	@Column(name="aadarNumber")
	String aadarNumber;
	@Column(name="appointmentDate")
	String appointmentDate;
	@Column(name="age")
	String age;

	public PatientDetail(String patientName, String patientGender, String patientEmail, String patientPassword,
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
	public PatientDetail() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "PatientDetail [id=" + id + ", patientName=" + patientName + ", patientGender=" + patientGender
				+ ", patientEmail=" + patientEmail + ", patientPassword=" + patientPassword + ", patientProblem="
				+ patientProblem + ", aadarNumber=" + aadarNumber + ", appointmentDate=" + appointmentDate + ", age="
				+ age + "]";
	}




}
