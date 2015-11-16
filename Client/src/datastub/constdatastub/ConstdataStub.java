package datastub.constdatastub;

import java.rmi.RemoteException;

import dataservice.constdataservice.ConstdataService;
import po.ConstPO;

public class ConstdataStub implements ConstdataService {

	@Override
	public void update(ConstPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
	}

	@Override
	public ConstPO find() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		ConstPO po=new ConstPO(0, 0, 0, 0, 0, 0);
		return po;
	}

}
