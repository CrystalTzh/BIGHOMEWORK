package businesslogic.stub.corporationblStub;

import businesslogicservice.corporationblservice.DriverInfocorporationblService;
import vo.DriverInfoVO;

public class DriverInfocorporationblStub implements DriverInfocorporationblService{

	@Override
	public DriverInfoVO create() {
		// TODO Auto-generated method stub
		System.out.println("Call DriverInfoVO create...");
		return null;
	}

	@Override
	public boolean add(DriverInfoVO vo) {
		// TODO print add carInfo successfully!
		System.out.println("Call DriverInfoVO add...");
		return true;
	}

	@Override
	public boolean delete(DriverInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call DriverInfoVO delete...");
		return false;
	}

	@Override
	public DriverInfoVO find(long driverNumber) {
		// TODO Auto-generated method stub
		System.out.println("Call DriverInfoVO find...");
		return null;
	}

	@Override
	public DriverInfoVO update() {
		// TODO Auto-generated method stub
		System.out.println("Call DriverInfoVO update...");
		return null;
	}

}
