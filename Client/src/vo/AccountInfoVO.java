package vo;

import java.io.Serializable;

public class AccountInfoVO implements Serializable{
	long bankAccount;//银行账户
	int password;//银行账户密码
	double balance;//余额
	
	public AccountInfoVO(long bankAccount, int password
			, double balance) {
		this.bankAccount = bankAccount;
		this.password = password;
		this.balance = balance;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public int getPassword() {
		return password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
