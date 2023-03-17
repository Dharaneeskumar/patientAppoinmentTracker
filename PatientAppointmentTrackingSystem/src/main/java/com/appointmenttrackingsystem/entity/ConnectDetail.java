package com.appointmenttrackingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="connectdetail")
public class ConnectDetail {

	@Id
	@Column(name="id")
	int id;
	@Column(name="doctorEmail")
	String doctorEmail;
	@Column(name="patientEmail")
	String patientEmail;
	public ConnectDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConnectDetail(int id,String doctorEmail, String patientEmail) {
		super();
		this.id=id;
		this.doctorEmail = doctorEmail;
		this.patientEmail = patientEmail;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	@Override
	public String toString() {
		return "ConnectDetail [doctorEmail=" + doctorEmail + ", patientEmail=" + patientEmail + "]";
	}

}
