package com.appointmenttrackingsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointmenttrackingsystem.dao.DeleteDao;

@Controller
@RequestMapping("/deletecontroller")
public class DeleteController {
	
	@Autowired
DeleteDao dao;
	@RequestMapping("/deletereception")
	public String deleterecepion(@RequestParam ("recdel") String email) {
		dao.deletereceptionado(email);
		return "redirect:/login/adminlogin";
		
		
	}
@RequestMapping("/deletedoctor")
	public String deletedoctor(@RequestParam ("doctorEmail") String email) {
		dao.deletedoctorado(email);
		return "redirect:/login/adminlogin";
	}
	}