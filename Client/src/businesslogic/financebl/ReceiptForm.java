package businesslogic.financebl;

import java.util.ArrayList;

import businesslogicservice.financeblservice.ReceiptFormFinanceblService;
import vo.ReceiptFormVO;

public class ReceiptForm implements ReceiptFormFinanceblService{

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
	public ReceiptFormVO RecieptFormcreate(String date, double money, String e, ArrayList<Long> i, long NO) {
		// TODO Auto-generated method stub
		return null;
	}

}
