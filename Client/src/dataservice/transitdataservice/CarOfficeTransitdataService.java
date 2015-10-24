package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.CarOfficePO;

public interface CarOfficeTransitdataService {
	public CarOfficePO find(long NO) throws RemoteException;
	public void insert(CarOfficePO po) throws RemoteException;
	public void delete(long NO) throws RemoteException;
	public void update(CarOfficePO po) throws RemoteException;
}
