package com.appointmenttrackingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmenttrackingsystem.dao.ReceptionistDao;
import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReceptionistDetail;
import com.appointmenttrackingsystem.entity.ReportStatus;
@Service
public class ReceptionistService {
	@Autowired
	ReceptionistDao dao;
public List<PatientDetail> recepservice(String email) {
	
return	dao.recepreport(email);
 
}
}
