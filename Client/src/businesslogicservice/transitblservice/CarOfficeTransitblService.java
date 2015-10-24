package businesslogicservice.transitblservice;

import vo.CarOfficeVO;

public interface CarOfficeTransitblService {
	public CarOfficeVO CarOfficeFormcreate ();
	public void CarOfficeFormcancel (CarOfficeVO vo);
	public boolean CarOfficeFormsave (CarOfficeVO vo);
	public boolean CarOfficeFormsubmit (CarOfficeVO vo);
	public boolean CarOfficeFormwithdraw (CarOfficeVO vo);
}
