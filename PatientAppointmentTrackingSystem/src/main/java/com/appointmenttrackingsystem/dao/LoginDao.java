package com.appointmenttrackingsystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.appointmenttrackingsystem.Model.AdminModel;
import com.appointmenttrackingsystem.Model.DoctorModel;
import com.appointmenttrackingsystem.Model.PatientModel;
import com.appointmenttrackingsystem.Model.ReceptionistModel;
import com.appointmenttrackingsystem.entity.AdminDetail;
import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReceptionistDetail;

@Repository
@EnableTransactionManagement
public class LoginDao {

	@Autowired
	SessionFactory sessionfactory;

@Transactional
public String admindao(AdminModel admin) {
	
	Session session=sessionfactory.getCurrentSession();
	
	AdminDetail email=session.get(AdminDetail.class,admin.getAdminEmail());
	if(email==null) {
		return "null";
	}
	else {
		return email.getAdminPassword();
	}
}
	@Transactional
	public List<DoctorDetail> adminprocessDoctordao(){
		
		Session session=sessionfactory.getCurrentSession();
		 return session.createQuery("FROM DoctorDetail",DoctorDetail.class).getResultList(); 
	}
	@Transactional
	public List<ReceptionistDetail> adminprocessReceponistdao(){
		
		Session session=sessionfactory.getCurrentSession();
		 return session.createQuery("FROM ReceptionistDetail",ReceptionistDetail.class).getResultList(); 
		
}

@Transactional
public String patientdao(PatientModel patient) {
	
	Session session=sessionfactory.getCurrentSession();
	
	PatientDetail email=session.get(PatientDetail.class,patient.getPatientEmail());
	if(email==null) {
		return "null";
	}
	else {
		return email.getPatientPassword();
	}
}

@Transactional
public String recepdao(ReceptionistModel patient) {
	
	Session session=sessionfactory.getCurrentSession();
	
	ReceptionistDetail email=session.get(ReceptionistDetail.class,patient.getReceptionistEmail());
	if(email==null) {
		return "null";
	}
	else {
		return email.getReceptionistPassword();
	}
}

@Transactional
public String doctordao(DoctorModel patient) {
	
	Session session=sessionfactory.getCurrentSession();
	
	DoctorDetail email=session.get(DoctorDetail.class,patient.getDoctorEmail());
	if(email==null) {
		return "null";
	}
	else {
		return email.getDoctorPassword();
	}
}
}
