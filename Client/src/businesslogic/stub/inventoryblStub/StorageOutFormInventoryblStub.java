package businesslogic.stub.inventoryblStub;

import state.Transport;
import vo.StorageOutFormVO;
import businesslogicservice.inventoryblservice.StorageOutFormInventoryblService;

public class StorageOutFormInventoryblStub implements
		StorageOutFormInventoryblService {

	@Override
	public StorageOutFormVO StorageOutFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void StorageOutFormcancel(StorageOutFormVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean StorageOutFormsave(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StorageOutFormsubmit(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StorageOutFormwithdraw(StorageOutFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean storageOutFormAddInfo(String date, String destination,
			Transport transport, String relayNumber, String motorNumber) {
		// TODO Auto-generated method stub
		
		return true;
	}

}
