package com.mailplants.admin.users.service;


import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mailplants.admin.users.dao.UserInfoDao;
import com.mailplants.admin.users.domain.UserInfo;


@Service("userInfoService")

public class UserInfoServiceImpl implements UserInfoService {

	private Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	protected UserInfoDao userInfoDao;
	
	@Transactional
	public List<UserInfo> selectUserInfoList(HashMap<String, String> map){
		return userInfoDao.selectUserInfoList(map);
	}

}
