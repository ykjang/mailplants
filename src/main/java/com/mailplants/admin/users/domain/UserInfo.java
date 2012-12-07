package com.mailplants.admin.users.domain;

public class UserInfo {

	@Override
	public String toString() {
		return toString();
	}
	private String id;
	private String pwd;
	private String level;
	private String f_name;
	private String l_name;
	private String email;
	private String phone;
	private String street;
	private String city;
	private String country;
	private String zipcode;
	private String register_d;
	private String act_key;
	private String act_flag;
	private String act_d;
	private String act_detail;
	private String spamer_yn;
	private String push_token;
	private String device_type;
	private String push_allow_flag;
	private String admin_yn;
	private String activate_yn;
	
	private LoginHistory loginHistory;
	
	
	
	
	public LoginHistory getLoginHistory() {
		return loginHistory;
	}
	public void setLoginHistory(LoginHistory loginHistory) {
		this.loginHistory = loginHistory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getRegister_d() {
		return register_d;
	}
	public void setRegister_d(String register_d) {
		this.register_d = register_d;
	}
	public String getAct_key() {
		return act_key;
	}
	public void setAct_key(String act_key) {
		this.act_key = act_key;
	}
	public String getAct_flag() {
		return act_flag;
	}
	public void setAct_flag(String act_flag) {
		this.act_flag = act_flag;
	}
	public String getAct_d() {
		return act_d;
	}
	public void setAct_d(String act_d) {
		this.act_d = act_d;
	}
	public String getAct_detail() {
		return act_detail;
	}
	public void setAct_detail(String act_detail) {
		this.act_detail = act_detail;
	}
	public String getSpamer_yn() {
		return spamer_yn;
	}
	public void setSpamer_yn(String spamer_yn) {
		this.spamer_yn = spamer_yn;
	}
	public String getPush_token() {
		return push_token;
	}
	public void setPush_token(String push_token) {
		this.push_token = push_token;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getPush_allow_flag() {
		return push_allow_flag;
	}
	public void setPush_allow_flag(String push_allow_flag) {
		this.push_allow_flag = push_allow_flag;
	}
	public String getAdmin_yn() {
		return admin_yn;
	}
	public void setAdmin_yn(String admin_yn) {
		this.admin_yn = admin_yn;
	}
	public String getActivate_yn() {
		return activate_yn;
	}
	public void setActivate_yn(String activate_yn) {
		this.activate_yn = activate_yn;
	}
	
}
