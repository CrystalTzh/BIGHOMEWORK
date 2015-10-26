package businesslogic.stub.corporationblStub;

import businesslogicservice.corporationblservice.DriverInfocorporationblService;
import vo.DriverInfoVO;

public class DriverInfocorporationblStub implements DriverInfocorporationblService{

	@Override
	public DriverInfoVO create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(DriverInfoVO vo) {
		// TODO print add carInfo successfully!
		return true;
	}

	@Override
	public boolean delete(DriverInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverInfoVO find(long driverNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverInfoVO update() {
		// TODO Auto-generated method stub
		return null;
	}

}
