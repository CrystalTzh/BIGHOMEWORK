package businesslogicservice.financeblservice;

import state.FormState;
import vo.AccountInfoVO;

public interface AccountInfoFinanceblService {
	public AccountInfoVO create();
	public boolean add(AccountInfoVO vo);
	public boolean delete(AccountInfoVO vo);
	public AccountInfoVO find(long bankAccount);
	
	public AccountInfoVO add(long bankAccount,int password);
}
