package vo;

import java.io.Serializable;

import state.FormState;

public class AccountInfoVO implements Serializable{
	long bankAccount;//银行账户
	int password;//银行账户密码
	double balance;//余额
	FormState formstate;//单据的状态
	
	public AccountInfoVO(long bankAccount, int password
			, double balance, FormState formstate) {
		this.bankAccount = bankAccount;
		this.password = password;
		this.balance = balance;
		this.formstate = formstate;
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

	public FormState getFormstate() {
		return formstate;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
	
}
