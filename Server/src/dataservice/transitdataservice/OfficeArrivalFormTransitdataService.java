package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.OfficeArrivalFormPO;

public interface OfficeArrivalFormTransitdataService {

	public OfficeArrivalFormPO find(long NO) throws RemoteException;

	public void insert(OfficeArrivalFormPO po) throws RemoteException;
	
	public void delete(OfficeArrivalFormPO po) throws RemoteException;
	
	public void update(OfficeArrivalFormPO po) throws RemoteException;
	
}
