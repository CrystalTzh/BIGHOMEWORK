package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.CarInputFormTransitblService;
import vo.CarInputFormVO;

public class CarInputFormTransitblStub implements CarInputFormTransitblService{

	@Override
	public CarInputFormVO CarInputFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call CatInputFormcreat...");
		return null;
	}

	@Override
	public void CarInputFormcancel(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarInputFormcancel...");
	}

	@Override
	public boolean CarInputFormsave(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarInputFormsave...");
		return false;
	}

	@Override
	public boolean CarInputFormsubmit(CarInputFormVO vo) {
		// TODO print "Submit successfully!"
		System.out.println("Call CarInputFormsubmit...");
		return true;
	}

	@Override
	public boolean CarInputFormwithdraw(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarInputFormwithdraw...");
		return false;
	}
	
}
