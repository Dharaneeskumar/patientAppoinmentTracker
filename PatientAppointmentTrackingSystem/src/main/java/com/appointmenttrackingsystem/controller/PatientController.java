package com.appointmenttrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appointmenttrackingsystem.entity.PatientDetail;
import com.appointmenttrackingsystem.entity.ReportStatus;
import com.appointmenttrackingsystem.service.PatientService;

@Controller
@RequestMapping("/patientcontroller")
public class PatientController {

	@Autowired
	PatientService service;
//	@RequestMapping("/patientpage")
//	public String patientPage(Model model) {
//		
//		List<ReportStatus> list=service.patientservice();
//	model.addAttribute("list", list);
//	List<PatientDetail> list2=service.patientDetailservice();
//	model.addAttribute("list2",list2);
//		return "patientpage";
//	}
}
