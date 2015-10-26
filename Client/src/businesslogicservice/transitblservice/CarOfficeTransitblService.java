package businesslogicservice.transitblservice;

import vo.CarOfficeFormVO;

public interface CarOfficeTransitblService {
	public CarOfficeFormVO CarOfficeFormcreate ();
	public void CarOfficeFormcancel (CarOfficeFormVO vo);
	public boolean CarOfficeFormsave (CarOfficeFormVO vo);
	public boolean CarOfficeFormsubmit (CarOfficeFormVO vo);
	public boolean CarOfficeFormwithdraw (CarOfficeFormVO vo);
}
