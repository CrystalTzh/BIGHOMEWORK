package businesslogic.driver.corporationblDriver;

import businesslogicservice.corporationblservice.DriverInfocorporationblService;
import state.SexList;
import vo.DriverInfoVO;

public class DriverInfocorporationblDriver {
	public void drive(DriverInfocorporationblService driverInfocorporationblStub) {
		DriverInfoVO driverInfoVO = new DriverInfoVO(1, "n", "b", "i", 2, "l", SexList.MAN);
		if(driverInfocorporationblStub.add(driverInfoVO))
			System.out.println("add driverInfo successfully!");
	}
}
