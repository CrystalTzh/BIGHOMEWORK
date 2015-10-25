package dataservice.constdataservice;

import java.rmi.RemoteException;

import po.ConstPO;

public interface ConstdataService {
	public void update(ConstPO po) throws RemoteException;
	public ConstPO find() throws RemoteException;
}
