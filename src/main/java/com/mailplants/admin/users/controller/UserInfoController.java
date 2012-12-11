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
	public String userStatusList(@RequestParam(required = false) HashMap<String, String> params,
								 @RequestParam(defaultValue = "1") int currPage,
								 @RequestParam(defaultValue = "2") int rowPerPage,
								 Model model){
		
		// System.out.println("[currPage] " + currPage);
		// System.out.println("[rowPerPage] " + rowPerPage);
		
		// Paging 
		int firstPage = ( ( ( currPage - 1) / 10 ) * 10 )+ 1;
		
		
		int totalCount = userInfoServcie.selectUserInfoListCount(params);
		int totalPage = totalCount%rowPerPage==0?totalCount/rowPerPage:(totalCount/rowPerPage)+1;
		int start = rowPerPage*currPage - rowPerPage;
		
		// System.out.println("[firstPage] " + firstPage);
		// System.out.println("[totalPage] " + totalPage);
		
		params.put("start", start+"");
		params.put("limit", rowPerPage+"");
		
		List<UserInfo> list = userInfoServcie.selectUserInfoList(params);
		
		// View Model Set
		model.addAttribute("firstPage", firstPage);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("currPage", currPage);
		
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
