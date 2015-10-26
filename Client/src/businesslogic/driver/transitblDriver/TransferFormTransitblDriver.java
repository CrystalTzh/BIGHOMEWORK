package businesslogic.driver.transitblDriver;

import businesslogicservice.transitblservice.TransferFormblService;
import vo.TransferFormVO;

public class TransferFormTransitblDriver {
	public void drive(TransferFormblService transferFormTransitblStub) {
		TransferFormVO transferFormVO = new TransferFormVO();
		if(transferFormTransitblStub.TransferFormsubmit(transferFormVO))
			System.out.println("Submit TransferForm  successfully!");
	}
}
