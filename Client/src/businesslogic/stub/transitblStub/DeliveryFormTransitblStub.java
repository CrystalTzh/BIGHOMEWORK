package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.DeliveryFormTransitblService;
import vo.DeliveryFormVO;

public class DeliveryFormTransitblStub implements DeliveryFormTransitblService{

	@Override
	public DeliveryFormVO DeliveryFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call DeliveryFormcreate...");
		return null;
	}

	@Override
	public void DeliveryFormcancel(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call DeliveryFormcancel...");
	}

	@Override
	public boolean DeliveryFormsave(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call DeliveryFormsave...");
		return false;
	}

	@Override
	public boolean DeliveryFormsubmit(DeliveryFormVO vo) {
		// TODO print "Submit successfully!"
		System.out.println("Call DeliveryFormsubmit...");
		return true;
	}

	@Override
	public boolean DeliveryFormwithdraw(DeliveryFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call DeliveryFormwithdraw");
		return false;
	}

}
