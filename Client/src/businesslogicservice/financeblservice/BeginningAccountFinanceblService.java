package businesslogicservice.financeblservice;

import java.util.ArrayList;

import po.AccountInfoPO;
import po.CarInfoPO;
import po.DriverInfoPO;
import po.UserInfoPO;

public interface BeginningAccountFinanceblService {

	public boolean initAccounts (int year, ArrayList<UserInfoPO> userInfopo,
			ArrayList< CarInfoPO > carInfopo ,
			ArrayList< DriverInfoPO > driverInfopo ,
			ArrayList<AccountInfoPO> accountInfopo);
}
