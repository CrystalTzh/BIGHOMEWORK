package datastub.corporationdatastub;

import java.rmi.RemoteException;

import dataservice.corporationdataservice.DriverInfoCorporationdataService;
import po.DriverInfoPO;
import state.SexList;

public class DriverInfoCorporationdataStub implements DriverInfoCorporationdataService{

	@Override
	public DriverInfoPO find() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		DriverInfoPO po=new DriverInfoPO(0, "a", "b", "c", 0, "d", SexList.MAN);
		return po;
	}

	@Override
	public void update(DriverInfoPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
		
	}

}
