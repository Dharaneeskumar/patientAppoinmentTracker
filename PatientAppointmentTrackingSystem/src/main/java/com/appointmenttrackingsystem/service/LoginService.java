package com.appointmenttrackingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmenttrackingsystem.Model.AdminModel;
import com.appointmenttrackingsystem.Model.DoctorModel;
import com.appointmenttrackingsystem.Model.PatientModel;
import com.appointmenttrackingsystem.Model.ReceptionistModel;
import com.appointmenttrackingsystem.dao.LoginDao;
import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.entity.ReceptionistDetail;

@Service
public class LoginService {

	@Autowired
	LoginDao logindao;
	public boolean adminService(AdminModel admin) {
		
		if(logindao.admindao(admin).equals(admin.getAdminPassword())) {
			
			return true;
		}
		else
			return false;
	}
	
	public List<DoctorDetail>  adminPageDoctor(){
		
		List<DoctorDetail> list=logindao.adminprocessDoctordao();
		return list;
	}

	public List<ReceptionistDetail>  adminPageReceptionist(){
		
		List<ReceptionistDetail> list=logindao.adminprocessReceponistdao();
		return list;
	}
	
	
	public boolean patientService(PatientModel patient) {
		
		if(logindao.patientdao(patient).equals(patient.getPatientPassword())) {
			
			return true;
		}
		else
			return false;
	}
public boolean receploginService(ReceptionistModel patient) {
		
		if(logindao.recepdao(patient).equals(patient.getReceptionistPassword())) {
			
			return true;
		}
		else
			return false;
	}

public boolean doctorService(DoctorModel patient) {
		
		if(logindao.doctordao(patient).equals(patient.getDoctorPassword())) {
			
			return true;
		}
		else
			return false;
	}
}
