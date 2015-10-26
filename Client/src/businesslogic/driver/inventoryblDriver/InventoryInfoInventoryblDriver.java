package businesslogic.driver.inventoryblDriver;

import state.Zone;
import vo.InventoryInfoVO;
import businesslogicservice.inventoryblservice.InventoryInfoInventoryblSercice;

public class InventoryInfoInventoryblDriver {
	public void driver(InventoryInfoInventoryblSercice inventoryInfoInventoryblStub){
		InventoryInfoVO inventoryInfoVO = inventoryInfoInventoryblStub.add(null, 0.9);
		Zone zone = inventoryInfoVO.getEmptyZone();
		System.out.println("The emptyZone is "+zone);
	}
}
