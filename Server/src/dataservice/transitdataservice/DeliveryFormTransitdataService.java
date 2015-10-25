package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.DeliveryFormPO;

public interface DeliveryFormTransitdataService {
	public DeliveryFormPO find(long NO) throws RemoteException;
	public void insert(DeliveryFormPO po) throws RemoteException;
	public void delete(DeliveryFormPO po) throws RemoteException;
	public void update(DeliveryFormPO po) throws RemoteException;
}
