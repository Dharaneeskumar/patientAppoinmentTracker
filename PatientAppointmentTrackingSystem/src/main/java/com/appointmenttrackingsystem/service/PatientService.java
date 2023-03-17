package com.appointmenttrackingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmenttrackingsystem.dao.PatientDao;
import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReportStatus;
@Service
public class PatientService {
	@Autowired
	PatientDao dao;
public List<ReportStatus> patientservice(String email) {
	
return	dao.patientreport(email);
 
}

public List<PatientDetail> patientDetailservice(String email) {

return	dao.patientDetailreport(email);

}
}
