package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.OrderFormTransitblService;
import vo.OrderFormVO;

public class OrderFormTransitblStub implements OrderFormTransitblService{

	@Override
	public OrderFormVO OrderFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void OrderFormcancel(OrderFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean OrderFormsave(OrderFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean OrderFormsubmit(OrderFormVO vo) {
		// TODO print "Submit successfully!"
		return true;
	}

	@Override
	public boolean OrderFormwithdraw(OrderFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
