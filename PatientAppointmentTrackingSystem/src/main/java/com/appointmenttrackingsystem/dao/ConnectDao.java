package com.appointmenttrackingsystem.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.appointmenttrackingsystem.Model.ConnectModel;
import com.appointmenttrackingsystem.entity.ConnectDetail;

@Repository
@EnableTransactionManagement
public class ConnectDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public void connectDao(ConnectModel connect){
		Session session =sessionfactory.getCurrentSession();
		
	ConnectDetail con=new ConnectDetail(connect.getId(),connect.getDoctorEmail(),connect.getPatientEmail());
	session.save(con);
	}
}