package datastub.financedatastub;

import java.rmi.RemoteException;

import dataservice.financedataservice.ReceiptFormdataService;
import po.ReceiptFormPO;

public class ReceiptFormdataStub implements ReceiptFormdataService{
	public ReceiptFormPO find(long NO) throws RemoteException {
		System.out.println("Find Succeed!\n");
		ReceiptFormPO po = new ReceiptFormPO(null, 0, null, null, 0);
		return po;
	}
	public void insert(ReceiptFormPO po) throws RemoteException {
		System.out.println("Insert Succeed!\n");
	}
	public void delete(ReceiptFormPO po) throws RemoteException {
		System.out.println("Delete Succeed!\n");
	}
	public void update(ReceiptFormPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}
}
