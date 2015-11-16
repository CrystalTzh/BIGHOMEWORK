package businesslogic.stub.corporationblStub;

import businesslogicservice.corporationblservice.CarInfocorporationblService;
import vo.CarInfoVO;

public class CarInfocorporationblStub implements CarInfocorporationblService{

	@Override
	public CarInfoVO create() {
		// TODO Auto-generated method stub
		System.out.println("Call CarInfoVO create...");
		return null;
	}

	@Override
	public boolean add(CarInfoVO vo) {
		// TODO to print "add carInfo successfully!"
//		System.out.println("add carInfo successfully!");
		System.out.println("Call CarInfoVO add...");
		return true;
	}

	@Override
	public boolean delete(CarInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call CarInfoVO delete...");
		return false;
	}

	@Override
	public CarInfoVO find(String carNumber) {
		// TODO Auto-generated method stub
		System.out.println("Call CarInfoVO find...");
		return null;
	}

	@Override
	public CarInfoVO update() {
		// TODO Auto-generated method stub
		System.out.println("Call CarInfoVO update...");
		return null;
	}

}
