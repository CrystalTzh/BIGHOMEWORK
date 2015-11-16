package datadriver.constdatadriver;

import java.rmi.RemoteException;

import dataservice.constdataservice.ConstdataService;
import po.ConstPO;

public class ConstdataDriver {
	public void driver(ConstdataService constdataStub) throws RemoteException{
		ConstPO po=new ConstPO(0, 0, 0, 0, 0, 0);
		constdataStub.find();
		constdataStub.update(po);
	}
}
