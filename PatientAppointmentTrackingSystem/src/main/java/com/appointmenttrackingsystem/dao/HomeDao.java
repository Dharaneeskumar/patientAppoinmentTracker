package com.appointmenttrackingsystem.dao;

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
public class HomeDao {
	@Autowired
	SessionFactory sessionfactory;

	@Transactional
	public boolean admindao(AdminModel admin) {
		Session session=sessionfactory.getCurrentSession();
	AdminDetail user=new AdminDetail(admin.getAdminName(),admin.getAdminGender(),admin.getAdminEmail(),admin.getAdminPassword());
	
	if(session.save(user)!=null)
		return true;
	else
		return false;
	}
	@Transactional
	public boolean doctordao(DoctorModel doctor) {
		Session session=sessionfactory.getCurrentSession();
	
		DoctorDetail user=new DoctorDetail(doctor.getDoctorName(),doctor.getDoctorGender()
				,doctor.getDoctorEmail(),doctor.getDoctorPassword(),doctor.getDoctorSpecliest());
	if(session.save(user)!=null)
		return true;
	else
		return false;
	}
	
	@Transactional
	public boolean receptionistdao(ReceptionistModel rec) {
		Session session=sessionfactory.getCurrentSession();
		ReceptionistDetail user=new ReceptionistDetail(rec.getReceptionistName(),rec.getReceptionistGender(), rec.getReceptionistEmail(),
				rec.getReceptionistPassword(),rec.getReceptionistNumber());
	if(session.save(user)!=null)
		return true;
	else
		return false;
	}
	

	@Transactional
	public boolean patientdao(PatientModel patient) {
		Session session=sessionfactory.getCurrentSession();

		PatientDetail user=new PatientDetail(patient.getPatientName(), patient.getPatientGender(),patient.getPatientEmail(),
				patient.getPatientPassword(),patient.getPatientProblem(),
				patient.getAadarNumber(),patient.getAppointmentDate(),patient.getAge());
		
		if(session.save(user)!=null)
		return true;
	else
		return false;
	}
	
}
