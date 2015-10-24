package businesslogicservice.transitblservice;

public interface DeliveryFormTransitblService {

	public boolean addDeliveryFormInfo (String arrivaeDate, long ID, String deliveryMan);
	
	public boolean DeliveryFormcancel();
	
	public boolean DeliveryFormdelete();
	
	public boolean DeliveryFormwithdraw();
	
}
