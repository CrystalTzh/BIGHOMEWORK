package businesslogic.driver.inventoryblDriver;

import state.Transport;
import businesslogicservice.inventoryblservice.StorageOutFormInventoryblService;

public class StorageOutFormInventoryblDriver {
	public void driver(StorageOutFormInventoryblService storageOutFormInventoryblStub){
		boolean isSuccessful = storageOutFormInventoryblStub.storageOutFormAddInfo("20151025", "上海闵行区", Transport.PLANE, "10", "abcde");
		if(isSuccessful){
			System.out.println("StorageOutFormInfo added successfully!");
		}
	}
}
