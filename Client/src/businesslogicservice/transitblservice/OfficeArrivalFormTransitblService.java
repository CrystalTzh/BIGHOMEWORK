package businesslogicservice.transitblservice;

import state.State;

public interface OfficeArrivalFormTransitblService {

	public boolean addOfficeArrivalInfo (long relayformnumber,
			String startingpoint, State state);
	//根据中转单编号可以获取一批ID，然后更改货物的状态、历史轨迹等等
	public boolean OfficeArricalFormcancel();
	
	public boolean OfficeArricalFormdelete();
	
	public boolean OfficeArricalFormwithdraw();
	
}
