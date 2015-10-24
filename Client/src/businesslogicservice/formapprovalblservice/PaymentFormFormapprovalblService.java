package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.PaymentFormVO;

public interface PaymentFormFormapprovalblService extends Serializable {
	public boolean PaymentFormjudge (PaymentFormVO vo);
}
