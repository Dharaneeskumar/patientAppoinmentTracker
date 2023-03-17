package com.appointmenttrackingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmenttrackingsystem.Model.AdminModel;
import com.appointmenttrackingsystem.Model.DoctorModel;
import com.appointmenttrackingsystem.Model.PatientModel;
import com.appointmenttrackingsystem.Model.ReceptionistModel;
import com.appointmenttrackingsystem.dao.HomeDao;

@Service
public class HomeService {

	@Autowired
	HomeDao homedao;
	public boolean adminprocess(AdminModel admin) {
		 return homedao.admindao(admin);
	}
public boolean doctorprocess(DoctorModel doctor) {
		return homedao.doctordao(doctor);
}	
public boolean patientprocess(PatientModel patient) {
return homedao.patientdao(patient);
}
public boolean receptionistprocess(ReceptionistModel receptionsist) {
	return homedao.receptionistdao(receptionsist);
}
	
}
