package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.CarInputFormVO;

public interface CarInputFormFormapprovalblService extends Serializable {
	public boolean CarInputFormjudge (CarInputFormVO vo);
}
