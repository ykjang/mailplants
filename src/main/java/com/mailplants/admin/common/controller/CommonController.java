package com.mailplants.admin.common.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mailplants.admin.users.domain.UserInfo;
import com.mailplants.admin.users.service.UserInfoService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class CommonController  {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@Autowired
	private UserInfoService userInfoServcie;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome MailPlants Admin! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "index";




	}
	
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String login(Locale locale, Model model){
		logger.info("LoginForm load...");
		
		return "common/loginForm";
	}
	

	@RequestMapping(value = "/loginProc", method = RequestMethod.POST)
	public String loginProc(@ModelAttribute("loginForm") UserInfo userInfoForm, BindingResult result, Locale locale, Model model) {
		logger.info("the client locale is "+ locale.toString());
		
		logger.info("Login Start...");
		logger.info("userInfo : " + userInfoForm.toString());
 		
		// Service
		UserInfo userInfo = new UserInfo();
		//userInfo = userInfoServcie.changeInfo(userInfoForm);

		logger.info("controller userInfo : " + userInfo.toString());
		
		model.addAttribute("userInfo", userInfo);
		return "common/loginProc";
	}
	
}
