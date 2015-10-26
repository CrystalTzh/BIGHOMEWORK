package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.StorageInFormFormapprovalblService;
import vo.StorageInFormVO;

public class StorageInFormFormapprovalblStub implements StorageInFormFormapprovalblService{

	@Override
	public boolean StorageInFormjudge(StorageInFormVO vo) {
		// TODO print "Judge StorageInForm successfully!"
		return true;
	}

}
