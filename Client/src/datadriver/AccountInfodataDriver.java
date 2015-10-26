package datadriver;

import java.rmi.RemoteException;

import po.AccountInfoPO;
import dataservice.financedataservice.AccountInfodataService;

public class AccountInfodataDriver {
	public void driver(AccountInfodataService accountInfodataStub) throws RemoteException{
		AccountInfoPO po = new AccountInfoPO(0, 0, 0);
		accountInfodataStub.delete(po);
		accountInfodataStub.insert(po);
		accountInfodataStub.update(po);
		accountInfodataStub.find(0);
	}
}
