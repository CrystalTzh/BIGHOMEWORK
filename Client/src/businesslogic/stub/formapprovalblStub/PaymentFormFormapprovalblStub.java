package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.PaymentFormFormapprovalblService;
import vo.PaymentFormVO;

public class PaymentFormFormapprovalblStub implements PaymentFormFormapprovalblService{

	@Override
	public boolean PaymentFormjudge(PaymentFormVO vo) {
		// TODO print "Judge PaymentForm successfully!"
		return true;
	}

}
