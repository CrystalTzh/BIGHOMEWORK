package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.ReceiptFormFormapprovalblService;
import vo.ReceiptFormVO;

public class ReceiptFormFormapprovalblStub implements ReceiptFormFormapprovalblService{

	@Override
	public boolean ReceiptFormjudge(ReceiptFormVO vo) {
		// TODO print "Judge ReceiptForm successfully!"
		return true;
	}

}
