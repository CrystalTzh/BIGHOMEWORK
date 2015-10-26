package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.StorageOutFormFormapprovalblService;
import vo.StorageOutFormVO;

public class StorageOutFormFormapprovalblStub implements StorageOutFormFormapprovalblService{

	@Override
	public boolean StorageOutFormjudge(StorageOutFormVO vo) {
		// TODO print "Judge StorageOutForm successfully!"
		return true;
	}
	
}
