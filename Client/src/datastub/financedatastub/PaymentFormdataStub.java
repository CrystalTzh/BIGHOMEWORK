package data.datastub.financedatastub;

import java.rmi.RemoteException;

import dataservice.financedataservice.PaymentFormdataService;
import po.PaymentFormPO;

public class PaymentFormdataStub implements PaymentFormdataService{

	@Override
	public PaymentFormPO find(long NO) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!\n");
		PaymentFormPO po=new PaymentFormPO("a", NO, "b", NO, "A");
		return po;
	}

	@Override
	public void insert(PaymentFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!\n");
		
	}

	@Override
	public void delete(PaymentFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!\n");
		
	}

	@Override
	public void update(PaymentFormPO po) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!\n");
		
	}

}
