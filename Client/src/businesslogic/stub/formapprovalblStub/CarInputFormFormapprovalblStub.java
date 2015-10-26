package businesslogic.stub.formapprovalblStub;

import businesslogicservice.formapprovalblservice.CarInputFormFormapprovalblService;
import vo.CarInputFormVO;

public class CarInputFormFormapprovalblStub implements CarInputFormFormapprovalblService{

	@Override
	public boolean CarInputFormjudge(CarInputFormVO vo) {
		// TODO print "Judge CarInputForm successfully!"
		return true;
	}

}
