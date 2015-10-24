package dataservice.financedataservice;

import java.rmi.RemoteException;

import po.AccountPO;

public interface AccountdataService {
	public AccountPO find(long bankAccount) throws RemoteException;
	public void insert(AccountPO po) throws RemoteException;
	public void delete(AccountPO po) throws RemoteException;
	public void update(AccountPO po) throws RemoteException;
	
}
