package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.CarOfficeFormPO;

public interface CarOfficeTransitdataService {
	public CarOfficeFormPO find(long NO) throws RemoteException;
	public void insert(CarOfficeFormPO po) throws RemoteException;
	public void delete(CarOfficeFormPO po) throws RemoteException;
	public void update(CarOfficeFormPO po) throws RemoteException;
}
