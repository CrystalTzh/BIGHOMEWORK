package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface UserdataService {
	public UserPO find(long userAccount) throws RemoteException;
	public void insert(UserPO po) throws RemoteException;
	public void delete(UserPO po) throws RemoteException;
	public void update(UserPO po) throws RemoteException;
}
