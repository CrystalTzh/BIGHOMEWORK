package businesslogic.financebl;

import java.util.ArrayList;

import businesslogicservice.financeblservice.PaymentFormFinanceblService;
import vo.PaymentFormVO;

public class PaymentForm implements PaymentFormFinanceblService{

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
	public PaymentFormVO PaymentFormcreate(String date, double money, String name, long account, double rent, int year,
			ArrayList<Long> allNO, double salary, double bonus, String payDate, long NO, double freight) {
		// TODO Auto-generated method stub
		return null;
	}

}
