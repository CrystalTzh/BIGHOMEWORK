package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.CarInputFormPO;

public interface CarInputFormdataService {
	public CarInputFormPO find(long NO) throws RemoteException;
	public void insert(CarInputFormPO po) throws RemoteException;
	public void delete(long NO) throws RemoteException;
	public void update(CarInputFormPO po) throws RemoteException;
}
