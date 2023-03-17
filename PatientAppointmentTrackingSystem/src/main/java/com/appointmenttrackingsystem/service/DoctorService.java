package com.appointmenttrackingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmenttrackingsystem.dao.DoctorDao;
import com.appointmenttrackingsystem.entity.DoctorDetail;

@Service
public class DoctorService {

	@Autowired
	DoctorDao dao;
	
	public List<DoctorDetail> doctorDetailservice(String email){
		
		return dao.doctorreport(email); 
	}
}
