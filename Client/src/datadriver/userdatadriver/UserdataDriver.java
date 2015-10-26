package datadriver.userdatadriver;

import java.rmi.RemoteException;

import dataservice.userdataservice.UserdataService;
import po.UserInfoPO;
import state.UserRole;



public class UserdataDriver {
	public void driver(UserdataService userdataStub) throws RemoteException{
		UserInfoPO po=new UserInfoPO("10086", "a", UserRole.OFFICEMAN);
		userdataStub.delete(po);
		userdataStub.find(0);
		userdataStub.insert(po);
		userdataStub.update(po);
	}
}
