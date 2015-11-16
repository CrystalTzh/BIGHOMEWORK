package businesslogic.stub.financeblStub;

import vo.AccountInfoVO;
import businesslogicservice.financeblservice.AccountInfoFinanceblService;

public class AccountInfoFinanceblStub implements AccountInfoFinanceblService {

	@Override
	public AccountInfoVO create() {
		// TODO Auto-generated method stub
		System.out.println("Creating...");
		return null;
	}

	@Override
	public boolean add(AccountInfoVO vo) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(AccountInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Deleted!");
		return true;
	}

	@Override
	public AccountInfoVO find(long bankAccount) {
		// TODO Auto-generated method stub
		System.out.println("Found!");
		return null;
	}

	@Override
	public AccountInfoVO add(long bankAccount, int password) {
		// TODO Auto-generated method stub
		AccountInfoVO account = new AccountInfoVO(bankAccount, password, 0.0);
		return account;
	}


}
