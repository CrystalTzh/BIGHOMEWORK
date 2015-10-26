package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.DeliveryFormTransitblService;
import vo.DeliveryFormVO;

public class DeliveryFormTransitblStub implements DeliveryFormTransitblService{

	@Override
	public DeliveryFormVO DeliveryFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeliveryFormcancel(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean DeliveryFormsave(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeliveryFormsubmit(DeliveryFormVO vo) {
		// TODO print "Submit successfully!"
		return true;
	}

	@Override
	public boolean DeliveryFormwithdraw(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
