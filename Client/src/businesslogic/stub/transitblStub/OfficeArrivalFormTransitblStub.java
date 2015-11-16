package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.OfficeArrivalFormTransitblService;
import vo.OfficeArrivalFormVO;

public class OfficeArrivalFormTransitblStub implements OfficeArrivalFormTransitblService{

	@Override
	public OfficeArrivalFormVO OfficeArrivalFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call OfficeArrivalFormcreate...");
		return null;
	}

	@Override
	public void OfficeArrivalFormcancel(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OfficeArrivalFormcancel...");
	}

	@Override
	public boolean OfficeArrivalFormsave(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OfficeArrivalFormsave...");
		return false;
	}

	@Override
	public boolean OfficeArrivalFormsubmit(OfficeArrivalFormVO vo) {
		// TODO print "Submit successfully!"
		System.out.println("Call OfficeArrivalFormsubmit");
		return true;
	}

	@Override
	public boolean OfficeArrivalFormwithdraw(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OfficeArrivalFormwithdraw");
		return false;
	}

}
