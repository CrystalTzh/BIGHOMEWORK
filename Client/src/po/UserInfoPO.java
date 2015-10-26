package po;

import java.io.Serializable;
import state.UserRole;

public class UserInfoPO implements Serializable{
	String userAccount;//用户名（即账号）
	String password;//账号密码
	UserRole userRole;//用户类型（依据职业）
	
	public UserInfoPO(String accountID, String password, 
			UserRole userRole) {
		this.userAccount = accountID;
		this.password = password;
		this.userRole = userRole;
	}

	public UserInfoPO() {
		super();
		// TODO Auto-generated constructor stub
		this.userAccount = "admin";
		this.password = "admin";
	}


	public String getUserAccount() {
		return userAccount;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
}
