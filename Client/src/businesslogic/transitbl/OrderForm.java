package businesslogic.transitbl;

import businesslogicservice.transitblservice.OrderFormTransitblService;
import vo.OrderFormVO;

public class OrderForm implements OrderFormTransitblService{

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
		return true;
	}

	@Override
	public boolean OrderFormsubmit(OrderFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean OrderFormwithdraw(OrderFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
