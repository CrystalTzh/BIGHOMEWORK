package datadriver.corporationdatadriver;

import java.rmi.RemoteException;


import dataservice.corporationdataservice.DriverInfoCorporationdataService;
import po.DriverInfoPO;

public class DriverInfoCorporationdataDriver {
	public void driver(DriverInfoCorporationdataService driverInfoCorporationdatadataStub) throws RemoteException{
		DriverInfoPO po=new DriverInfoPO(0, null, null, null, 0, null, null);
		
		driverInfoCorporationdatadataStub.find();
		
		driverInfoCorporationdatadataStub.update(po);
	}
}
