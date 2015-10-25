package businesslogic.stub.financeblStub;

import state.FormState;
import vo.PaymentFormVO;
import businesslogicservice.financeblservice.PaymentFormFinanceblService;

public class PaymentFormFinanceblStub implements PaymentFormFinanceblService {

	@Override
	public PaymentFormVO PaymentFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void PaymentFormcancel(PaymentFormVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean PaymentFormsave(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PaymentFormsubmit(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PaymentFormwithdraw(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PaymentFormVO PaymentFormcreate(String date, double money,
			String name, long account, long NO) {
		// TODO Auto-generated method stub
		PaymentFormVO p = null;
		p = new PaymentFormVO(date,money,name,account,NO,FormState.EDITABLE);
		return p;
	}
	

}
