package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.StorageInFormVO;

public interface StorageInFormFormapprovalblService extends Serializable {
	public boolean StorageInFormjudge (StorageInFormVO vo);
}
