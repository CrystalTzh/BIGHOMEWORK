package businesslogic.stub.corporationblStub;

import businesslogicservice.corporationblservice.CarInfocorporationblService;
import vo.CarInfoVO;

public class CarInfocorporationblStub implements CarInfocorporationblService{

	@Override
	public CarInfoVO create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(CarInfoVO vo) {
		// TODO to print "add carInfo successfully!"
//		System.out.println("add carInfo successfully!");
		return true;
	}

	@Override
	public boolean delete(CarInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CarInfoVO find(String carNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarInfoVO update() {
		// TODO Auto-generated method stub
		return null;
	}

}
