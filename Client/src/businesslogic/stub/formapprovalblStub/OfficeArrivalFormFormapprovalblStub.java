package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.OfficeArrivalFormFormapprovalblService;
import vo.OfficeArrivalFormVO;

public class OfficeArrivalFormFormapprovalblStub implements OfficeArrivalFormFormapprovalblService{

	@Override
	public boolean OfficeArrivalFormjudge(OfficeArrivalFormVO vo) {
		// TODO print "Judge OfficeArrivalForm successfully!"
		System.out.println("Call OfficeArrivalFormjudge...");
		return true;
	}
	
}
