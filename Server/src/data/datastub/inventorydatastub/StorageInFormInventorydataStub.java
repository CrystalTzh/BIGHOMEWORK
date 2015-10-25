package data.datastub.inventorydatastub;

import java.rmi.RemoteException;

import dataservice.inventorydataservice.StorageInFormInventorydataService;
import po.StorageInFormPO;

public class StorageInFormInventorydataStub implements StorageInFormInventorydataService{
	public StorageInFormPO find(long NO) throws RemoteException {
		System.out.println("Find Succeed!\n");
		StorageInFormPO po = new StorageInFormPO(null, 0, null, null);
		return po;
	}
	public void insert(StorageInFormPO po) throws RemoteException {
		System.out.println("Insert Succeed!\n");
	}
	public void delete(StorageInFormPO po) throws RemoteException {
		System.out.println("Delete Succeed!\n");
	}
	public void update(StorageInFormPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}
}
