package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.TransferFormFormapprovalblService;
import vo.TransferFormVO;

public class TransferFormFormapprovalblStub implements TransferFormFormapprovalblService{

	@Override
	public boolean TransferFormjudge(TransferFormVO vo) {
		// TODO print "judge TransferForm successfully!"
		return true;
	}
	
}