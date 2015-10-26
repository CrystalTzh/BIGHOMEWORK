package datadriver.inventorydatadriver;

import java.rmi.RemoteException;

import dataservice.inventorydataservice.StorageOutFromInventorydataService;
import po.StorageOutFormPO;

public class StorageOutFormInventorydataDriver {
	public void driver(StorageOutFromInventorydataService storageOutFormInventorydataStub) throws RemoteException{
		StorageOutFormPO po=new StorageOutFormPO("A", 10086, "b", "c");
		storageOutFormInventorydataStub.delete(po);
		storageOutFormInventorydataStub.find(0);
		storageOutFormInventorydataStub.insert(po);
		storageOutFormInventorydataStub.update(po);
	}
}
