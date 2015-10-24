package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.OrderFormPO;

public interface OrderFormTransitdataService {
	public OrderFormPO find(long ID) throws RemoteException;
	public void insert(OrderFormPO po) throws RemoteException;
	public void delete(long ID) throws RemoteException;
	public void update(OrderFormPO po) throws RemoteException;
}
