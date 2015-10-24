package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.DeliveryFormVO;

public interface DeliveryFormFormapprovalblService extends Serializable {
	public boolean DeliveryFormjudge (DeliveryFormVO vo);
}
