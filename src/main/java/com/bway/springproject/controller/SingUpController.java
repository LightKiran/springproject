package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.dao.UserDao;
import com.bway.springproject.dao.UserDaoImpl;
import com.bway.springproject.model.User;

@Controller
public class SingUpController {
	@Autowired
	private UserDao userdao;
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String getSignUpForm(){
		return "signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute User u, Model model){
	/*	model.addAttribute("fname", u.getFname());
		model.addAttribute("lname", u.getLname());
		model.addAttribute("username", u.getUsername());
		model.addAttribute("password", u.getPassword());*/
		
		//UserDao userdao = new UserDaoImpl();
		
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
		
		userdao.userSignup(u);
		
		
		
		return "login";
	}
	
	
	
	
}
