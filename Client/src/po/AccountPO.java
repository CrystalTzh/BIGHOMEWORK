package po;
import java.io.Serializable;

public class AccountPO implements Serializable{
	long bankAccount;//银行账户
	String password;//银行账户密码
	double balance;//余额
	
	public AccountPO(long bankAccount, String password
			, double balance) {
		this.bankAccount = bankAccount;
		this.password = password;
		this.balance = balance;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public String getPassword() {
		return password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
