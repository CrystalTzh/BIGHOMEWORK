package businesslogicservice.transitblservice;

import state.Transport;

public interface TransferFormblService {

	public boolean addTransferFormInfo (Transport transport,String loadingMember,
			String relayNumber,String date);
	
	public boolean TransferFormcancel();
	
	public boolean TransferFormdelete();
	
	public boolean TransferFormwithdraw();
	
}
