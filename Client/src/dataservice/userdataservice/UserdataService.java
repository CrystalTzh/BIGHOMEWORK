package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserInfoPO;

public interface UserdataService {
	public UserInfoPO find(long userAccount) throws RemoteException;
	public void insert(UserInfoPO po) throws RemoteException;
	public void delete(UserInfoPO po) throws RemoteException;
	public void update(UserInfoPO po) throws RemoteException;
}
