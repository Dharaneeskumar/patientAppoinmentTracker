package com.appointmenttrackingsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appointmenttrackingsystem.Model.AdminModel;
import com.appointmenttrackingsystem.Model.ConnectModel;
import com.appointmenttrackingsystem.Model.DoctorModel;
import com.appointmenttrackingsystem.Model.PatientModel;
import com.appointmenttrackingsystem.Model.ReceptionistModel;
import com.appointmenttrackingsystem.dao.DoctorDao;
import com.appointmenttrackingsystem.entity.AdminDetail;
import com.appointmenttrackingsystem.entity.ConnectDetail;
import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReceptionistDetail;
import com.appointmenttrackingsystem.entity.ReportStatus;
import com.appointmenttrackingsystem.service.DoctorService;
import com.appointmenttrackingsystem.service.LoginService;
import com.appointmenttrackingsystem.service.PatientService;
import com.appointmenttrackingsystem.service.ReceptionistService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@Autowired
	PatientService patientservice;
	@Autowired
	ReceptionistService recepservice;
	
	@Autowired
	DoctorService doctorservice;
	@Autowired
	DoctorDao doctordao;
	@RequestMapping("/adminlogin")
	public String adminLogin(Model model) {
		AdminModel admin=new AdminModel();
		model.addAttribute("admin",admin);
		return "adminlogin";
	}

		@RequestMapping("/doctorlogin")
		public String doctorLogin(Model model) {
			DoctorModel doctor=new DoctorModel();
			
			model.addAttribute("doctor",doctor);
			return "doctorlogin";
		}
		

		@RequestMapping("/patientlogin")
		public String patientLogin(Model model) {
			PatientModel patient=new PatientModel();
			model.addAttribute("patient",patient);
			return "patient";
		}

		@RequestMapping("/receptionistlogin")
		public String receptionistLogin(Model model) {
			ReceptionistModel recep=new ReceptionistModel();
			model.addAttribute("recep", recep);
			return "receptionistlogin";
		}
		@RequestMapping("/adminprocess")
		public String adminprocess(@ModelAttribute AdminModel admin,Model model) {
		
			if(loginservice.adminService(admin)) {
			List<DoctorDetail> list= loginservice.adminPageDoctor();
			
			List<ReceptionistDetail> list2=loginservice.adminPageReceptionist();
			
				model.addAttribute("list", list);
				model.addAttribute("list2", list2);

			return "accountcreated";
		}
			else {
				return "homepage";
			}
			
		
		}
		@RequestMapping("/patientprocess")
		public String patientprocess(@ModelAttribute PatientModel patient,Model model) {
		
			if(loginservice.patientService(patient))
			{
				List<ReportStatus> list=patientservice.patientservice(patient.getPatientEmail());
				model.addAttribute("list", list);
				List<PatientDetail> list2=patientservice.patientDetailservice(patient.getPatientEmail());
				model.addAttribute("list2",list2);
				return "patientpage";

			}
						else
				return "homepage";
		}
		
		@RequestMapping("/receptionistprocess")
		public String receptionistprocess(@ModelAttribute ReceptionistModel recep,Model model) {
		
			if(loginservice.receploginService(recep))
			{
			List<PatientDetail>list1=	recepservice.recepservice("hai");
			
			model.addAttribute("list1", list1);
				return "receptionistpage";

			}
						else
				return "homepage";
		}

		@RequestMapping("/doctorprocess")
		public String doctorprocess(@ModelAttribute DoctorModel doctor,Model model,@ModelAttribute ConnectModel connect) {
		
			if(loginservice.doctorService(doctor))
			{
				List<DoctorDetail> list1=doctorservice.doctorDetailservice(doctor.getDoctorEmail());
				PatientDetail patient=doctordao.patentreport();
			
				model.addAttribute("list1", list1);
				model.addAttribute("patient", patient);
				return "doctorpage";

			}
				else
				return "homepage";
		}
}
