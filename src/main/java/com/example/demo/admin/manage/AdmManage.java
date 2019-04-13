package com.example.demo.admin.manage;

public class AdmManage {
	
	private Integer id;
	private String adminId;
	private String adminPw;
	private String adminDepart;
	private String adminPosit;
	private String adminEmail;
	private String adminName;
	private String adminCookie;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getAdminDepart() {
		return adminDepart;
	}
	public void setAdminDepart(String adminDepart) {
		this.adminDepart = adminDepart;
	}
	public String getAdminPosit() {
		return adminPosit;
	}
	public void setAdminPosit(String adminPosit) {
		this.adminPosit = adminPosit;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String getAdminCookie() {
		return adminCookie;
	}
	public void setAdminCookie(String adminCookie) {
		this.adminCookie = adminCookie;
	}
	
	@Override
	public String toString() {
		return "AdmManage [id=" + id + ", adminId=" + adminId + ", adminPw=" + adminPw + ", adminDepart=" + adminDepart
				+ ", adminPosit=" + adminPosit + ", adminEmail=" + adminEmail + ", adminName=" + adminName + "]";
	}
}
