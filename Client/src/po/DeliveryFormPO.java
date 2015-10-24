package po;
import java.io.Serializable;

public class DeliveryFormPO implements Serializable{
	String arrivaeDate;//到达日期
	long ID;//订单条形码号
	String deliveryMan;//派送员
	
	public DeliveryFormPO(String arrivaeDate,
			long ID, String deliveryMan) {
		this.arrivaeDate = arrivaeDate;
		this.ID = ID;
		this.deliveryMan = deliveryMan;
	}

	public String getArrivaeDate() {
		return arrivaeDate;
	}

	public long getID() {
		return ID;
	}

	public String getDeliveryMan() {
		return deliveryMan;
	}

	public void setArrivaeDate(String arrivaeDate) {
		this.arrivaeDate = arrivaeDate;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public void setDeliveryMan(String deliveryMan) {
		this.deliveryMan = deliveryMan;
	}
}
