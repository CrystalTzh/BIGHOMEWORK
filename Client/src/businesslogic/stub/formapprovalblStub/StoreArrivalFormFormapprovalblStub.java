package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.StoreArrivalFormFormapprovalblService;
import vo.StoreArrivalFormVO;

public class StoreArrivalFormFormapprovalblStub implements StoreArrivalFormFormapprovalblService{

	@Override
	public boolean StoreArrivalFormjudge(StoreArrivalFormVO vo) {
		// TODO print "Judge StoreArrivalForm successfully!"
		return true;
	}

}