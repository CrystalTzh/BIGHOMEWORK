package businesslogicservice.transitblservice;

import java.util.ArrayList;

public interface CarInputFormTransitblService {

	public boolean addCarInputFormInfo (String motorNumber, String destination, 
			String carNumber, String loadingMember,String supercargo,
			String date, ArrayList<Long> allIDs);
	
	public double RelayCaculateFreight(String destination);
	
	public boolean CarInputFormcancel();
	
	public boolean CarInputFormdelete();
	
	public boolean CarInputFormwithdraw();
	
}
