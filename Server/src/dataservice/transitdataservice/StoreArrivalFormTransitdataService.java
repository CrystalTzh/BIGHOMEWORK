package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.StoreArrivalFormPO;

public interface StoreArrivalFormTransitdataService {
	public StoreArrivalFormPO find(long NO) throws RemoteException;
	public void insert(StoreArrivalFormPO po) throws RemoteException;
	public void delete(StoreArrivalFormPO po) throws RemoteException;
	public void update(StoreArrivalFormPO po) throws RemoteException;
}
