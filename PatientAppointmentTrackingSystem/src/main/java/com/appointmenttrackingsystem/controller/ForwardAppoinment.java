package com.appointmenttrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.appointmenttrackingsystem.Model.ConnectModel;
import com.appointmenttrackingsystem.dao.ConnectDao;
import com.appointmenttrackingsystem.entity.DoctorDetail;
import com.appointmenttrackingsystem.service.LoginService;

@Controller
@RequestMapping("/forwardappoinment")
public class ForwardAppoinment {

	@Autowired
	ConnectDao connectdao;
	@Autowired
	 LoginService adminservice;
	@RequestMapping("/showform")
	public String showForwardForm(Model model, @RequestParam("patient") String patient) {
		ConnectModel conect=new ConnectModel();
		model.addAttribute("connect", conect);
		List<DoctorDetail> list=adminservice.adminPageDoctor();
		model.addAttribute("list", list);
		model.addAttribute("patient",patient);
		return "forwardform";
	}
	@RequestMapping("/processform")
	public ModelAndView processForm(@ModelAttribute ConnectModel connect) {
		
		System.out.println(connect.getDoctorEmail());
		System.out.println(connect.getPatientEmail());
		
		connectdao.connectDao(connect);
		
		return new ModelAndView("redirect:/forwardappoinment/showform");
		
	}
}
