package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.CarOfficeFormFormapprovalblService;
import vo.CarOfficeFormVO;

public class CarOfficeFormFormapprovalblStub implements CarOfficeFormFormapprovalblService{

	@Override
	public boolean CarOfficeFormjudge(CarOfficeFormVO vo) {
		// TODO print "Judge CarOfficeForm successfully!"
		return true;
	}

}
