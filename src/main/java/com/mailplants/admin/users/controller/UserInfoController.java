package com.mailplants.admin.users.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mailplants.admin.users.domain.UserInfo;
import com.mailplants.admin.users.service.UserInfoService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/user")
public class UserInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
	
	
	@Autowired
	private UserInfoService userInfoServcie;
	
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public String userStatusList(Locale locale, @RequestParam(required = false) HashMap<String, String> params, Model model){
		
		logger.info("a: " + params.get("a"));
		logger.info("b: " + params.get("b"));
		logger.info("c: " + params.get("c"));
		
		int curr_page = Integer.parseInt(params.get("curr_page"));
		int limits = Integer.parseInt(params.get("limits"));
		
		int total_count = 0;
		int total_page = total_count%limits==0?total_count/limits:(total_count/limits)+1;
		
		// Total Count
		
		
		
		List<UserInfo> list = userInfoServcie.selectUserInfoList(params);
		model.addAttribute("status", list);
		
		return "/user/status";
	}
	
	@RequestMapping(value = "/status2", method = RequestMethod.GET)
	public String searchUserInfo(Locale locale, @RequestParam(value="myparams[]") String[] params, Model model){
		
		logger.info("param size: " + params.length);
		logger.info("parms1:" + params[0]);
		
		return "/user/status";
	}
		
}
