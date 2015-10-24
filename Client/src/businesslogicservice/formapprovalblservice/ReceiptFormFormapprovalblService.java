package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.ReceiptFormVO;

public interface ReceiptFormFormapprovalblService extends Serializable {
	public boolean ReceiptFormjudge (ReceiptFormVO vo);
}
