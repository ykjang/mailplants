package com.mailplants.admin.users.dao;

import java.util.HashMap;
import java.util.List;

import com.mailplants.admin.users.domain.UserInfo;


public interface UserInfoDao {
	
	public List<UserInfo> selectUserInfoList(HashMap<String, String> map);
	
	public int selectUserInfoListCount(HashMap<String, String> map);
}
