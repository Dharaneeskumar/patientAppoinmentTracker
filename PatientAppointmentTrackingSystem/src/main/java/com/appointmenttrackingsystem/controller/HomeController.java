

package com.appointmenttrackingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appointmenttrackingsystem.Model.AdminModel;
import com.appointmenttrackingsystem.Model.DoctorModel;
import com.appointmenttrackingsystem.Model.PatientModel;
import com.appointmenttrackingsystem.Model.ReceptionistModel;
import com.appointmenttrackingsystem.service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeService homeservice;
		
	@RequestMapping("/hello")	
	public String hello() {	
		return "homepage";
	}
	@RequestMapping("/admin")	
	public String admin(Model model) {
	AdminModel admin=new AdminModel();
	model.addAttribute("admin",admin);
return "adminregester";		
}
	
	@RequestMapping("/doctor")	
	public String doctor(Model model) {
	DoctorModel doctor=new DoctorModel();
	model.addAttribute("doctor",doctor);
return "doctorregister";	
}
	@RequestMapping("/patient")	
	public String patient(Model model) {
	PatientModel patient=new PatientModel();
	model.addAttribute("patient",patient);
return "patientregister";	
}	
	@RequestMapping("/receptionist")	
	public String receptionist(Model model) {
	ReceptionistModel receptionist=new ReceptionistModel();
	model.addAttribute("receptionist",receptionist);
return "receptionistregister";	
}	

	@RequestMapping("/adminprocess")
	public String adminprocess(@ModelAttribute AdminModel admin,Model model) {
	if (homeservice.adminprocess(admin)) {
//			model.addAttribute("admin",admin);
			return "accountcreated";
		}
		else
		{
			return "accountnotcreated";
		}
	}
		
@RequestMapping("/doctorprocess")
	public String doctorprocess(@ModelAttribute  DoctorModel doctor) {
		
		if (homeservice.doctorprocess(doctor)) {
			
			return "accountcreated";
		}
		else
		{
			return "accountnotcreated";
		}
	}

	@RequestMapping("/receptionistprocess")
	public String receptionistprocess(@ModelAttribute ReceptionistModel recptionist) {
		
		if (homeservice.receptionistprocess(recptionist)) {
			
			return "accountcreated";
		}
		else
		{
			return "accountnotcreated";
		}
	}
	@RequestMapping("/patientprocess")
	public String patientprocess(@ModelAttribute PatientModel patient) {
		
		if (homeservice.patientprocess(patient)) {
			
			return "accountcreated";
		}
		else
		{
			return "accountnotcreated";
		}
	}
	
}