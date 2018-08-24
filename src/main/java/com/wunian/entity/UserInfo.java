package com.wunian.entity;
/**
 * UserInfo µÃÂ¿‡
 * @author Administrator
 *
 */
public class UserInfo {

	private Integer userId;
	private String userName;
	private String userPwd;
	private String userRole;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userRole="
				+ userRole + "]";
	}
	
}