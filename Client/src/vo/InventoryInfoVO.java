package vo;

import java.io.Serializable;
import java.util.ArrayList;

import state.FormState;
import state.Zone;
import businesslogic.inventorybl.LocationNode;

public class InventoryInfoVO implements Serializable {

	ArrayList<LocationNode> locationNode;
	double limit;
	Zone emptyZone;
	FormState formstate;//单据的状态
	
	public InventoryInfoVO(ArrayList<LocationNode> locationNode,double limit,Zone emptyZone, FormState formstate) {
		super();
		// TODO Auto-generated constructor stub
		this.locationNode = locationNode;
		this.limit = limit;
		this.emptyZone = emptyZone;
		this.formstate = formstate;
	}
	
	public ArrayList<LocationNode> getLocationNode() {
		return locationNode;
	}
	public double getLimit() {
		return limit;
	}
	public Zone getEmptyZone() {
		return emptyZone;
	}
	public void setLocationNode(ArrayList<LocationNode> locationNode) {
		this.locationNode = locationNode;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public void setEmptyZone(Zone emptyZone) {
		this.emptyZone = emptyZone;
	}

	public FormState getFormstate() {
		return formstate;
	}

	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
	
}
