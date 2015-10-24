package businesslogicservice.transitblservice;

import state.State;

public interface StoreArrivalFormTransitblService {

	public boolean addRelayArrivalInfo (long relayformnumber ,
			String startingpoint,State state );
	
	public boolean StoreArrivalFormcancel();
	
	public boolean StoreArrivalFormdelete();
	
	public boolean StoreArrivalFormwithdraw();
	
}
