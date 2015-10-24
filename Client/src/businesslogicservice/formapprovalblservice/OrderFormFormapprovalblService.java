package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.OrderFormVO;

public interface OrderFormFormapprovalblService extends Serializable {
	public boolean OrderFormjudge (OrderFormVO vo);
}
