package datastub.financedatastub;

import java.rmi.RemoteException;

import dataservice.financedataservice.AccountInfodataService;
import po.AccountInfoPO;

public class AccountInfodataStub implements AccountInfodataService{
	public AccountInfoPO find(long bankAccount) throws RemoteException {
		System.out.println("Find Succeed!\n");
		AccountInfoPO po = new AccountInfoPO(0, 0, 0);
		return po;
	}
	public void insert(AccountInfoPO po) throws RemoteException {
		System.out.println("Insert Succeed!\n");
	}
	public void delete(AccountInfoPO po) throws RemoteException {
		System.out.println("Delete Succeed!\n");
	}
	public void update(AccountInfoPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}
	
}
