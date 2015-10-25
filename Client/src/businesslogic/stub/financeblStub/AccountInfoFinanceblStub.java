package businesslogic.stub.financeblStub;

import state.FormState;
import vo.AccountInfoVO;
import businesslogicservice.financeblservice.AccountInfoFinanceblService;

public class AccountInfoFinanceblStub implements AccountInfoFinanceblService {

	@Override
	public AccountInfoVO create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(AccountInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(AccountInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AccountInfoVO find(long bankAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountInfoVO add(long bankAccount, int password) {
		// TODO Auto-generated method stub
		AccountInfoVO account = new AccountInfoVO(12345678, 123, 0.0);
		return account;
	}


}
