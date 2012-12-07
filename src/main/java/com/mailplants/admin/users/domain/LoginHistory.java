package com.mailplants.admin.users.domain;

public class LoginHistory {

	@Override
	public String toString() {
		return toString();
	}
	
	private String user_id;
	private String register_d;
	private String ip_address;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRegister_d() {
		return register_d;
	}
	public void setRegister_d(String register_d) {
		this.register_d = register_d;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	
}
