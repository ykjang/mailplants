package com.mailplants.admin.users.service;

import java.util.HashMap;
import java.util.List;

import com.mailplants.admin.users.domain.UserInfo;


public interface UserInfoService {
	
	public List<UserInfo> selectUserInfoList(HashMap<String, String> map);
}
