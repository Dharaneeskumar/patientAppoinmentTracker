package com.appointmenttrackingsystem.Model;

import javax.persistence.Column;
import javax.persistence.Id;

public class ConnectModel {

	int id;
	
		public ConnectModel(int id, String doctorEmail, String patientEmail) {
		super();
		this.id = id;
		this.doctorEmail = doctorEmail;
		this.patientEmail = patientEmail;
	}

		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		String doctorEmail;
	
	String patientEmail;

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

	public ConnectModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConnectModel [id=" + id + ", doctorEmail=" + doctorEmail + ", patientEmail=" + patientEmail + "]";
	}
	
	
}
