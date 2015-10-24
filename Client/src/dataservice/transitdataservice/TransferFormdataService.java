package dataservice.transitdataservice;

import java.rmi.RemoteException;

import po.TransferFormPO;

public interface TransferFormdataService {
	public TransferFormPO find(long NO) throws RemoteException;
	public void insert(TransferFormPO po) throws RemoteException;
	public void delete(long NO) throws RemoteException;
	public void update(TransferFormPO po) throws RemoteException;
}
