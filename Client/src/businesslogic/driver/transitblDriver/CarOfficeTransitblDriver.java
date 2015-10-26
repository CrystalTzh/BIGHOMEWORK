package businesslogic.driver.transitblDriver;

import businesslogic.stub.transitblStub.CarOfficeTransitblStub;
import businesslogicservice.transitblservice.CarOfficeTransitblService;
import vo.CarOfficeFormVO;

public class CarOfficeTransitblDriver {
	public void drive(CarOfficeTransitblService carOfficeTransitblStub) {
		CarOfficeFormVO carOfficeFormVO = new CarOfficeFormVO();
		if(carOfficeTransitblStub.CarOfficeFormsubmit(carOfficeFormVO))
			System.out.println("Submit CarOfficeForm  successfully!");
	}
}
