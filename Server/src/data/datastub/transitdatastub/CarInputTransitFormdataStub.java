package data.datastub.transitdatastub;

import java.rmi.RemoteException;

import dataservice.transitdataservice.CarInputTransitFormdataService;
import po.CarInputFormPO;

public class CarInputTransitFormdataStub implements CarInputTransitFormdataService{
	public CarInputFormPO find(long NO) throws RemoteException {
		System.out.println("Find Succeed!\n");
		CarInputFormPO po = new CarInputFormPO(0, null, null, null, null, null, null, null, 0);
		return po;
	}
	public void insert(CarInputFormPO po) throws RemoteException {
		System.out.println("Insert Succeed!\n");
	}
	public void delete(CarInputFormPO po) throws RemoteException {
		System.out.println("Delete Succeed!\n");
	}
	public void update(CarInputFormPO po) throws RemoteException {
		System.out.println("Update Succeed!\n");
	}
}
