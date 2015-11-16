package businesslogic.stub.inventoryblStub;

import state.Transport;
import vo.StorageOutFormVO;
import businesslogicservice.inventoryblservice.StorageOutFormInventoryblService;

public class StorageOutFormInventoryblStub implements
		StorageOutFormInventoryblService {

	@Override
	public StorageOutFormVO StorageOutFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("call StorageOutFormcreate...");
		return null;
	}

	@Override
	public void StorageOutFormcancel(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call StorageOutFormcancel...");

	}

	@Override
	public boolean StorageOutFormsave(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call StorageOutFormsave...");
		return false;
	}

	@Override
	public boolean StorageOutFormsubmit(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call StorageOutFormsubmit...");
		return false;
	}

	@Override
	public boolean StorageOutFormwithdraw(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call StorageOutFormwithdraw...");
		return false;
	}

	@Override
	public boolean storageOutFormAddInfo(String date, String destination,
			Transport transport, String relayNumber, String motorNumber) {
		// TODO Auto-generated method stub
		System.out.println("call storageOutFormAddInfo...");
		return true;
	}

}
