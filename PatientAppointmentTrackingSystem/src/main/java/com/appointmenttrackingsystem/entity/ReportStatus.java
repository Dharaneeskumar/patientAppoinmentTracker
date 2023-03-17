package com.appointmenttrackingsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ReportStatus")
public class ReportStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recordId")
	int recordId;
	@Column(name="appointmentDate")
	String appointmentDate;
	@Column(name="appointmentStatus")
	String appointmentStatus;
	@Column(name="doctorEmail")
	String doctorEmail;
	@Column(name="patientEmail")
	String patientEmail;
	
	public ReportStatus(int recordId, String appointmentDate, String appointmentStatus, String doctorEmail,String paemail) {
		super();
		this.recordId = recordId;
		this.appointmentDate = appointmentDate;
		this.appointmentStatus = appointmentStatus;
		this.doctorEmail = doctorEmail;
		this.patientEmail=paemail;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	
	public ReportStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReportStatus(String appointmentDate, String appointmentStatus) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentStatus = appointmentStatus;
		
	}
	@Override
	public String toString() {
		return "ReportStatus [recordId=" + recordId + ", appointmentDate=" + appointmentDate + ", appointmentStatus="
				+ appointmentStatus + ", doctorEmail=" + doctorEmail + ", patientEmail=" + patientEmail + "]";
	}
	

}
