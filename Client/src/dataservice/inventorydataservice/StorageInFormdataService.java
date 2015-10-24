package dataservice.inventorydataservice;

import java.rmi.RemoteException;

import po.StorageInFormPO;

public interface StorageInFormdataService {
	public StorageInFormPO find(long NO) throws RemoteException;
	public void insert(StorageInFormPO po) throws RemoteException;
	public void delete(StorageInFormPO po) throws RemoteException;
	public void update(StorageInFormPO po) throws RemoteException;
}
