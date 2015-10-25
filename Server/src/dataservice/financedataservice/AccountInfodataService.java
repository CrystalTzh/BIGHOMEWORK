package dataservice.financedataservice;

import java.rmi.RemoteException;

import po.AccountInfoPO;

public interface AccountInfodataService {
	public AccountInfoPO find(long bankAccount) throws RemoteException;
	public void insert(AccountInfoPO po) throws RemoteException;
	public void delete(AccountInfoPO po) throws RemoteException;
	public void update(AccountInfoPO po) throws RemoteException;
	
}
