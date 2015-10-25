package businesslogic.stub.financeblStub;

import java.util.ArrayList;

import state.FormState;
import vo.ReceiptFormVO;
import businesslogicservice.financeblservice.ReceiptFormFinanceblService;

public class ReceiptFormFinanceblStub implements ReceiptFormFinanceblService {

	@Override
	public ReceiptFormVO RecieptFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RecieptFormcancel(ReceiptFormVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean RecieptFormsave(ReceiptFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RecieptFormsubmit(ReceiptFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RecieptFormwithdraw(ReceiptFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReceiptFormVO RecieptFormcreate(String date, double money, String e,
			ArrayList<Long> i, long NO) {
		// TODO Auto-generated method stub
		ReceiptFormVO r = null;
		r = new ReceiptFormVO(date,money,e,i,NO,FormState.EDITABLE);
		return r;
	}

}
