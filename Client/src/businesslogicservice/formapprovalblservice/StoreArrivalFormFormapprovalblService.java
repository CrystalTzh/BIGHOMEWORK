package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.StoreArrivalFormVO;

public interface StoreArrivalFormFormapprovalblService extends Serializable {
	public boolean StoreArrivalFormjudge (StoreArrivalFormVO vo);
}
