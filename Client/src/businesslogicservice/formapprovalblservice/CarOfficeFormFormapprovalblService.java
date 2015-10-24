package businesslogicservice.formapprovalblservice;

import java.io.Serializable;

import vo.CarOfficeFormVO;

public interface CarOfficeFormFormapprovalblService extends Serializable {
	public boolean CarOfficeFormjudge (CarOfficeFormVO vo);
}
