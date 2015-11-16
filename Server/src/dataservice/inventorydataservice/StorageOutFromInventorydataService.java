package dataservice.inventorydataservice;

import java.rmi.RemoteException;

import po.StorageOutFormPO;

public interface StorageOutFromInventorydataService {
	public StorageOutFormPO find(long NO) throws RemoteException;
	public void insert(StorageOutFormPO po) throws RemoteException;
	public void delete(StorageOutFormPO po) throws RemoteException;
	public void update(StorageOutFormPO po) throws RemoteException;
}
