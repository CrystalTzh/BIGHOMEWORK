package data.datastub.userdatastub;

import java.rmi.RemoteException;

import dataservice.userdataservice.UserdataService;
import po.UserInfoPO;
import state.UserRole;

public class UserdataStub implements UserdataService {

	@Override
	public UserInfoPO find(long userAccount) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		UserInfoPO po=new UserInfoPO(10086, "a", UserRole.OFFICEMAN);
		return po;
	}

	@Override
	public void insert(UserInfoPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!\n");
		
	}

	@Override
	public void delete(UserInfoPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!\n");
		
	}

	@Override
	public void update(UserInfoPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
		
	}

}
