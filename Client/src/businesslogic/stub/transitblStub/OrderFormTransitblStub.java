package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.OrderFormTransitblService;
import vo.OrderFormVO;

public class OrderFormTransitblStub implements OrderFormTransitblService{

	@Override
	public OrderFormVO OrderFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call OrderFormcreate...");
		return null;
	}

	@Override
	public void OrderFormcancel(OrderFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OrderFormcancel...");
	}

	@Override
	public boolean OrderFormsave(OrderFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OrderFormsave");
		return false;
	}

	@Override
	public boolean OrderFormsubmit(OrderFormVO vo) {
		// TODO print "Submit successfully!"
		System.out.println("Call OrderFormsubmit");
		return true;
	}

	@Override
	public boolean OrderFormwithdraw(OrderFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call OrderFormwithdraw...");
		return false;
	}

}
