package businesslogic.financebl;

import java.util.ArrayList;

import businesslogicservice.financeblservice.BeginningAccountFinanceblService;
import po.AccountInfoPO;
import po.CarInfoPO;
import po.DriverInfoPO;
import po.UserInfoPO;

public class BeginningAccount implements BeginningAccountFinanceblService{

	@Override
	public boolean initAccounts(int year, ArrayList<UserInfoPO> userInfopo, ArrayList<CarInfoPO> carInfopo,
			ArrayList<DriverInfoPO> driverInfopo, ArrayList<AccountInfoPO> accountInfopo) {
		// TODO Auto-generated method stub
		return false;
	}

}
