package datadriver.transitdatadriver;

import java.rmi.RemoteException;

import po.DeliveryFormPO;
import dataservice.transitdataservice.DeliveryFormTransitdataService;

public class DeliveryFormTransitdataDriver {
	public void driver(DeliveryFormTransitdataService deliveryFormTransitdataStub) throws RemoteException{
		DeliveryFormPO po = new DeliveryFormPO(null, 0, null);
		deliveryFormTransitdataStub.delete(po);
		deliveryFormTransitdataStub.find(0);
		deliveryFormTransitdataStub.insert(po);
		deliveryFormTransitdataStub.update(po);
	}
}
