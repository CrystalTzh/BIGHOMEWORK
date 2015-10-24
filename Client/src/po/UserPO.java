package po;
<<<<<<< HEAD

import java.io.Serializable;
import state.UserRole;
=======
import java.io.Serializable;
>>>>>>> origin/master

public class UserPO implements Serializable{
	long userAccount;//用户名（即账号）
	String password;//账号密码
	UserRole userRole;//用户类型（依据职业）
	
	public UserPO(long accountID, String password, 
			UserRole userRole) {
		this.userAccount = accountID;
		this.password = password;
		this.userRole = userRole;
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
}
