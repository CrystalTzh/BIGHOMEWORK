package businesslogic.stub.inventoryblStub;

import state.Zone;
import vo.StorageInFormVO;
import businesslogicservice.inventoryblservice.StorageInFormInventoryblService;

public class StorageInFormInventoryblStub implements
		StorageInFormInventoryblService {

	@Override
	public StorageInFormVO StorageInFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void StorageInFormcancel(StorageInFormVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean StorageInFormsave(StorageInFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StorageInFormsubmit(StorageInFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StorageInFormwithdraw(StorageInFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StorageInFormAddInfo(String date, String destination,
			Zone zone, int line, int shelf, int tag, long ID) {
		// TODO Auto-generated method stub
		
		return true;
	}

}