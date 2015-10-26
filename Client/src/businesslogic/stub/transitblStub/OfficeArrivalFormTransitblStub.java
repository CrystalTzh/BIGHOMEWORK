package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.OfficeArrivalFormTransitblService;
import vo.OfficeArrivalFormVO;

public class OfficeArrivalFormTransitblStub implements OfficeArrivalFormTransitblService{

	@Override
	public OfficeArrivalFormVO OfficeArrivalFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void OfficeArrivalFormcancel(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean OfficeArrivalFormsave(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean OfficeArrivalFormsubmit(OfficeArrivalFormVO vo) {
		// TODO print "Submit successfully!"
		return true;
	}

	@Override
	public boolean OfficeArrivalFormwithdraw(OfficeArrivalFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
