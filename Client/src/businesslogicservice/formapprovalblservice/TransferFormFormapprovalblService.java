package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.TransferFormVO;

public interface TransferFormFormapprovalblService extends Serializable {
	public boolean TransferFormjudge (TransferFormVO vo);
}
