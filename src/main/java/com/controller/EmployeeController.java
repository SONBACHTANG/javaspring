package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.EmployeeDTO;
import com.service.EmployeetService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeetService service;
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
	    List<EmployeeDTO> list=service.findAll();
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("listemployee",list);
		for(EmployeeDTO dto:list) {
			System.out.println(list);
		}
		
		
		return mav;
	}
	

}
