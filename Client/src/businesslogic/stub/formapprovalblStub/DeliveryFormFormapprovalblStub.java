package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.DeliveryFormFormapprovalblService;
import vo.DeliveryFormVO;

public class DeliveryFormFormapprovalblStub implements DeliveryFormFormapprovalblService{

	@Override
	public boolean DeliveryFormjudge(DeliveryFormVO vo) {
		// TODO print "Judge DeliveryForm successfully!"
		return true;
	}

}