package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.CarOfficeTransitblService;
import vo.CarInfoVO;
import vo.CarOfficeFormVO;

public class CarOfficeTransitblStub implements CarOfficeTransitblService{

	@Override
	public CarOfficeFormVO CarOfficeFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CarOfficeFormcancel(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean CarOfficeFormsave(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CarOfficeFormsubmit(CarOfficeFormVO vo) {
		// TODO print "Submit CarOfficeForm Successfully!"
		return true;
	}

	@Override
	public boolean CarOfficeFormwithdraw(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}



}
