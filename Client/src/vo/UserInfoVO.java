package vo;

import java.io.Serializable;

import state.FormState;
import state.UserRole;

public class UserInfoVO implements Serializable{
	long userAccount;//用户名（即账号）
	String password;//账号密码
	UserRole userRole;//用户类型（依据职业）
	FormState formstate;//单据的状态
	
	public UserInfoVO(long accountID, String password, 
			UserRole userRole, FormState formstate) {
		this.userAccount = accountID;
		this.password = password;
		this.userRole = userRole;
		this.formstate = formstate;
	}

	public long getUserAccount() {
		return userAccount;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserAccount(long userAccount) {
		this.userAccount = userAccount;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
}
