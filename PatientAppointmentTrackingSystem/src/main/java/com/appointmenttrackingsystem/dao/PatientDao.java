package com.appointmenttrackingsystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReportStatus;

@Repository
@EnableTransactionManagement
public class PatientDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public List<ReportStatus> patientreport(String email){
		Session session =sessionfactory.getCurrentSession();
		
	 Query<ReportStatus> query=session.createQuery("from ReportStatus where patientEmail='"+  email+  "'",ReportStatus.class);
		
	List<ReportStatus> list	=query.getResultList();
	return list;
	}
	@Transactional
	public List<PatientDetail> patientDetailreport(String email){
		Session session =sessionfactory.getCurrentSession();
		
	 Query<PatientDetail> query=session.createQuery("from PatientDetail where patientEmail='" + email+ "'",PatientDetail.class);
		
	List<PatientDetail> list	=query.getResultList();
	return list;
	}
}
