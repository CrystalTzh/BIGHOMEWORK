package dataservice.financedataservice;

import java.rmi.RemoteException;

import po.ReceiptFormPO;

public interface ReceiptFormdataService {
	public ReceiptFormPO find(long NO) throws RemoteException;
	public void insert(ReceiptFormPO po) throws RemoteException;
	public void delete(ReceiptFormPO po) throws RemoteException;
	public void update(ReceiptFormPO po) throws RemoteException;
}
