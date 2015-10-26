package datadriver.inventorydatadriver;

import java.rmi.RemoteException;

import po.StorageInFormPO;
import dataservice.inventorydataservice.StorageInFormInventorydataService;

public class StorageInFormInventorydataDriver {
	public void driver(StorageInFormInventorydataService storageInFormInventorydataStub) throws RemoteException{
		StorageInFormPO po = new StorageInFormPO(null, 0, null, null);
		storageInFormInventorydataStub.delete(po);
		storageInFormInventorydataStub.find(0);
		storageInFormInventorydataStub.insert(po);
		storageInFormInventorydataStub.update(po);
	}
}
