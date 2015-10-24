package dataservice.corporationdataservice;

import java.rmi.RemoteException;

import po.DriverInfoPO;

public interface DriverInfodataService {
	public DriverInfoPO find() throws RemoteException;
	public void update(DriverInfoPO po) throws RemoteException;
}
