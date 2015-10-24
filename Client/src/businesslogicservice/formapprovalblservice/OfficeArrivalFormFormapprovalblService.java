package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.OfficeArrivalFormVO;

public interface OfficeArrivalFormFormapprovalblService extends Serializable {
	public boolean OfficeArrivalFormjudge (OfficeArrivalFormVO vo);
}
