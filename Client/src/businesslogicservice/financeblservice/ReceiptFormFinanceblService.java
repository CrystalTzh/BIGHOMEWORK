package businesslogicservice.financeblservice;

import vo.ReceiptFormVO;

public interface ReceiptFormFinanceblService {
	public ReceiptFormVO RecieptFormcreate ();
	public void RecieptFormcancel (ReceiptFormVO vo);
	public boolean RecieptFormsave (ReceiptFormVO vo);
	public boolean RecieptFormsubmit (ReceiptFormVO vo);
	public boolean RecieptFormwithdraw (ReceiptFormVO vo);
}
