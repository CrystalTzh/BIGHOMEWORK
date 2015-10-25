package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.CarInputFormPO;

public interface CarInputTransitFormdataService {
	public CarInputFormPO find(long NO) throws RemoteException;
	public void insert(CarInputFormPO po) throws RemoteException;
	public void delete(CarInputFormPO po) throws RemoteException;
	public void update(CarInputFormPO po) throws RemoteException;
}
