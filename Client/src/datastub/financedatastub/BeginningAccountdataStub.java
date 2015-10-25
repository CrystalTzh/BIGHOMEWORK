package datastub.financedatastub;


import java.rmi.RemoteException;

import dataservice.financedataservice.BeginningAccountdataService;
import po.BeginningAccountPO;

public class BeginningAccountdataStub implements BeginningAccountdataService{

	@Override
	public BeginningAccountPO find(int year) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		BeginningAccountPO po=new BeginningAccountPO(1024, null, null, null, null);
		return po;
	}

	@Override
	public void insert(BeginningAccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!\n");
		
	}

	@Override
	public void delete(BeginningAccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!\n");
		
	}

	@Override
	public void update(BeginningAccountPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
		
	}

}
