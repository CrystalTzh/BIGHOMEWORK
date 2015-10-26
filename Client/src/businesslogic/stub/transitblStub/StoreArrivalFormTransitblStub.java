package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.StoreArrivalFormTransitblService;
import vo.StoreArrivalFormVO;

public class StoreArrivalFormTransitblStub implements StoreArrivalFormTransitblService{

	@Override
	public StoreArrivalFormVO StoreArrivalFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void StoreArrivalFormcancel(StoreArrivalFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean StoreArrivalFormsave(StoreArrivalFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean StoreArrivalFormsubmit(StoreArrivalFormVO vo) {
		// TODO print "Submit successfully!"
		return true;
	}

	@Override
	public boolean StoreArrivalFormwithdraw(StoreArrivalFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
