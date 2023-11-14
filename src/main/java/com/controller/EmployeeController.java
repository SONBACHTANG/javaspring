package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value = "/add-employee", method = RequestMethod.GET)
	public ModelAndView addpage() {
	   
		ModelAndView mav = new ModelAndView("addemployee");
		
	
		return mav;
	}
	@RequestMapping(value = "/add-employee_ok", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute EmployeeDTO employee, Model model) {
	
        service.save(employee);
        model.addAttribute("employee", employee);
        return "list"; // Tên của view hiển thị thông tin nhân viên (ví dụ: employee-details.jsp)
    }
	


}
