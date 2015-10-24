package dataservice.inventorydataservice;

import java.rmi.RemoteException;

import po.InventoryInfoPO;

public interface InventoryInfodataService {
	public InventoryInfoPO find() throws RemoteException;
	public void update(InventoryInfoPO po) throws RemoteException;
}
