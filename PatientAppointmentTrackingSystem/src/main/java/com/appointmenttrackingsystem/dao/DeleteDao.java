package com.appointmenttrackingsystem.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.entity.ReceptionistDetail;

@Repository
public class DeleteDao{
	
	@Autowired
	SessionFactory sessionfactory;

	@Transactional
public void deletedoctorado(String email) {
	Session session=sessionfactory.getCurrentSession();
	
	DoctorDetail doctor=session.get(DoctorDetail.class, email);
	session.delete(doctor);
	
}

	@Transactional
public void deletereceptionado(String email) {
	Session session=sessionfactory.getCurrentSession();
	
	ReceptionistDetail rec=session.get(ReceptionistDetail.class, email);
	session.delete(rec);
	
}
}
