package dataservice.financedataservice;

import java.rmi.RemoteException;

import po.PaymentFormPO;

public interface PaymentFormdataService {
	public PaymentFormPO find(long NO) throws RemoteException;
	public void insert(PaymentFormPO po) throws RemoteException;
	public void delete(PaymentFormPO po) throws RemoteException;
	public void update(PaymentFormPO po) throws RemoteException;
}
