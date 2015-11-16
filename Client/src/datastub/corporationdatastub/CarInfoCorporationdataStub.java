package datastub.corporationdatastub;

import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.corporationdataservice.CarInfoCorporationdataService;
import po.CarInfoPO;
import po.OrderFormPO;

public class CarInfoCorporationdataStub implements CarInfoCorporationdataService{
	public ArrayList<OrderFormPO> find() throws RemoteException {
		System.out.println("Find Succeed!\n");
		ArrayList<OrderFormPO> po = new ArrayList<OrderFormPO>();
		return po;
	}
	public void update(CarInfoPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}
}
