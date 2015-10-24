package businesslogicservice.transitblservice;

import java.util.ArrayList;

public interface CarOfficeFormTransitblService {

	public boolean addCarOfficeFormInfo (String motorNumber, String destination, 
			String carNumber, String loadingMember,
			String supercargo, ArrayList<Long> allIDs);
	
	public double OfficeCaculateFreight(String destination);
	
	public boolean CarOfficeFormcancel();
	
	public boolean CarOfficeFormdelete();
	
	public boolean CarOfficeFormwithdraw();
}
