package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.CarOfficeFormTransitblService;
import vo.CarInfoVO;
import vo.CarOfficeFormVO;

public class CarOfficeTransitblStub implements CarOfficeFormTransitblService{

	@Override
	public CarOfficeFormVO CarOfficeFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call CarOfficeFormcreate...");
		return null;
	}

	@Override
	public void CarOfficeFormcancel(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarOfficeFormcancel...");
	}

	@Override
	public boolean CarOfficeFormsave(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarOfficeFormsave...");
		return false;
	}

	@Override
	public boolean CarOfficeFormsubmit(CarOfficeFormVO vo) {
		// TODO print "Submit CarOfficeForm Successfully!"
		System.out.println("Call CarOfficeFormsubmit...");
		return true;
	}

	@Override
	public boolean CarOfficeFormwithdraw(CarOfficeFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarOfficeFormwithdraw...");
		return false;
	}
}
