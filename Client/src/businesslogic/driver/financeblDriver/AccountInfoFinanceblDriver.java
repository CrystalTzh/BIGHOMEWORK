package businesslogic.driver.financeblDriver;

import vo.AccountInfoVO;
import businesslogicservice.financeblservice.AccountInfoFinanceblService;

public class AccountInfoFinanceblDriver {
	public void driver(AccountInfoFinanceblService accountInfoFinanceblStub){
		AccountInfoVO accountInfoVO = accountInfoFinanceblStub.add(12345678, 123);
		double balance = accountInfoVO.getBalance();
		System.out.println("The balance is "+balance);
		accountInfoFinanceblStub.find(12345678);
		if(accountInfoFinanceblStub.delete(accountInfoVO)){
			System.out.println("Deleted successfully!");
		}
		if(accountInfoFinanceblStub.add(accountInfoVO)){
			System.out.println("Added successfully!");
		}
		accountInfoFinanceblStub.create();
	}
}
