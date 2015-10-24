package dataservice.corporationdataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.CarInfoPO;
import po.OrderFormPO;

public interface CarInfodataService {
	public ArrayList<OrderFormPO> find() throws RemoteException;
	public void update(CarInfoPO po) throws RemoteException;
}
