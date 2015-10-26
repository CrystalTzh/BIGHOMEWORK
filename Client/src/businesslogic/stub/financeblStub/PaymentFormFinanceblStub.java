package businesslogic.stub.financeblStub;

import java.util.ArrayList;

import state.FormState;
import vo.PaymentFormVO;
import businesslogicservice.financeblservice.PaymentFormFinanceblService;

public class PaymentFormFinanceblStub implements PaymentFormFinanceblService {

	@Override
	public PaymentFormVO PaymentFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call PaymentFormcreate...");
		return null;
	}

	@Override
	public void PaymentFormcancel(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call PaymentFormcancel...");
	}

	@Override
	public boolean PaymentFormsave(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call PaymentFormsave...");
		return false;
	}

	@Override
	public boolean PaymentFormsubmit(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call PaymentFormsubmit...");
		return false;
	}

	@Override
	public boolean PaymentFormwithdraw(PaymentFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call PaymentFormwithdraw...");
		return false;
	}

	@Override
	public PaymentFormVO PaymentFormcreate(String date, double money,
			String name, long account,  double rent, int year,ArrayList<Long> allNO, double salary,
			double bonus, String payDate,long NO,double freight) {
		// TODO Auto-generated method stub
		PaymentFormVO p = null;
		p = new PaymentFormVO(date, money, name, account, 
				rent, year, allNO, salary,
				bonus, payDate, NO,freight,FormState.EDITABLE);
		return p;
	}

	

}
