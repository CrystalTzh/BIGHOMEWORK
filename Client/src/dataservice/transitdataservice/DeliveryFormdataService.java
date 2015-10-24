package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.DeliveryFormPO;

public interface DeliveryFormdataService {
	public DeliveryFormPO find(long NO) throws RemoteException;
	public void insert(DeliveryFormPO po) throws RemoteException;
	public void delete(long NO) throws RemoteException;
	public void update(DeliveryFormPO po) throws RemoteException;
}
