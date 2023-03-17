package com.appointmenttrackingsystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.appointmenttrackingsystem.Model.ConnectModel;
import com.appointmenttrackingsystem.entity.ConnectDetail;
import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.entity.PatientDetail;

@Repository
@EnableTransactionManagement
public class DoctorDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public List<DoctorDetail> doctorreport(String email){
		Session session =sessionfactory.getCurrentSession();
		
	 Query<DoctorDetail> query=session.createQuery("from DoctorDetail where doctorEmail='"+  email+  "'",DoctorDetail.class);
		
	 List<DoctorDetail> list	=query.getResultList();
	return list;
	}
	@Transactional
	public PatientDetail patentreport(){
		Session session =sessionfactory.getCurrentSession();
		
	//	Query<ConnectDetail> connect=session.createQuery("from ConnectDetail where doctorEmail='guru@gmail.com'",ConnectDetail.class);

		
	ConnectDetail query=session.get(ConnectDetail.class, 1);
String patient=query.getPatientEmail();
System.out.println(patient);
PatientDetail list=session.get(PatientDetail.class, patient);
	return list;
	}
}
