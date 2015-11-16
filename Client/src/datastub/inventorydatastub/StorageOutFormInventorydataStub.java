package datastub.inventorydatastub;

import java.rmi.RemoteException;

import dataservice.inventorydataservice.StorageOutFromInventorydataService;
import po.StorageOutFormPO;

public class StorageOutFormInventorydataStub implements StorageOutFromInventorydataService {

	@Override
	public StorageOutFormPO find(long NO) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		StorageOutFormPO po=new StorageOutFormPO("A", 10086, "b", "c");
		return po;
	}

	@Override
	public void insert(StorageOutFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!\n");
		
	}

	@Override
	public void delete(StorageOutFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!\n");
		
	}

	@Override
	public void update(StorageOutFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
		
	}

}
