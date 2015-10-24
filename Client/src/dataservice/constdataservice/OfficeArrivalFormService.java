package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.OfficeArrivalFormPO;

public interface OfficeArrivalFormService {

	public OfficeArrivalFormPO find(long NO) throws RemoteException;

	public void insert(OfficeArrivalFormPO po) throws RemoteException;
	
	public void delete(long NO) throws RemoteException;
	
	public void update(OfficeArrivalFormPO po) throws RemoteException;
	
}