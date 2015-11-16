package com.mailplants.admin.users.dao;

import java.util.HashMap;
import java.util.List;


import org.springframework.stereotype.Repository;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mailplants.admin.users.domain.UserInfo;


@Repository("userInfoDao")
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {

	
	public List<UserInfo> selectUserInfoList(HashMap<String, String> map){
		
		List<UserInfo> records = getSqlSession().selectList("userinfo.selectUserInfoList", map);
		return records;
	}




	public int selectUserInfoListCount(HashMap<String, String> map){
		return (Integer)getSqlSession().selectOne("userinfo.selectUserInfoListCount", map);
	}
}
