package businesslogic.stub.inventoryblStub;

import java.util.ArrayList;

import state.FormState;
import state.Zone;
import vo.InventoryInfoVO;
import businesslogic.inventorybl.LocationNode;
import businesslogicservice.inventoryblservice.InventoryInfoInventoryblSercice;

public class InventoryInfoInventoryblStub implements InventoryInfoInventoryblSercice{

	@Override
	public boolean invetoryInfoSetWarningLimit(double limit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Zone inventoryAlarm(InventoryInfoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean invetoryAdjustment(Zone zone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InventoryInfoVO storageCheck(String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryInfoVO inventoryCounting(Zone zone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventoryInfoVO add(ArrayList<LocationNode> locationNode,
			double limit, Zone emptyZone) {
		// TODO Auto-generated method stub
		InventoryInfoVO i = null;
		i = new InventoryInfoVO(locationNode,limit,emptyZone,FormState.EDITABLE);
		return i;
	}

}
