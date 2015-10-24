package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.StorageOutFormVO;

public interface StorageOutFormFormapprovalblService extends Serializable {
	public boolean StorageOutFormjudge (StorageOutFormVO vo);
}
