package com.mailplants.admin.users.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mailplants.admin.users.domain.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/appServlet/servlet-context.xml","classpath:/mybatis-context.xml"})
public class UserInfoServiceImplTest {
	
	
	
	@Autowired
	private UserInfoService userInfoService;









	
	
	@Ignore
	public void testSelectUserInfoListCount() {
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("search_word", "aiwhite75");
		param.put("search_type", "id");
		
		int count = userInfoService.selectUserInfoListCount(param);
		
		System.out.println(count);
		
	}
	
	@Ignore
	public void testSelectUserInfoList() {
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("search_word", "");
		param.put("search_type", "");
		
		List<UserInfo> records = userInfoService.selectUserInfoList(param);
		
		System.out.println(records.size());
		
		String a = ((UserInfo)records.get(0)).getId();
		System.out.println(a);
	}
}
