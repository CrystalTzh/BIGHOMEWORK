import businesslogic.driver.constblDriver.ConstInfoConstblDriver;
import businesslogic.driver.financeblDriver.AccountInfoFinanceblDriver;
import businesslogic.driver.financeblDriver.PaymentFormFinanceblDriver;
import businesslogic.driver.financeblDriver.ReceiptFormFinanceblDriver;
import businesslogic.driver.inventoryblDriver.InventoryInfoInventoryblDriver;
import businesslogic.driver.inventoryblDriver.StorageInFormInventoryblDriver;
import businesslogic.driver.inventoryblDriver.StorageOutFormInventoryblDriver;
import businesslogic.driver.userblDriver.UserInfoUserblDriver;
import businesslogic.stub.constblStub.ConstInfoConstblStub;
import businesslogic.stub.financeblStub.AccountInfoFinanceblStub;
import businesslogic.stub.financeblStub.PaymentFormFinanceblStub;
import businesslogic.stub.financeblStub.ReceiptFormFinanceblStub;
import businesslogic.stub.inventoryblStub.InventoryInfoInventoryblStub;
import businesslogic.stub.inventoryblStub.StorageInFormInventoryblStub;
import businesslogic.stub.inventoryblStub.StorageOutFormInventoryblStub;
import businesslogic.stub.userblStub.UserInfoUserblStub;
import businesslogic.driver.corporationblDriver.CarInfocorporationblDriver;

import businesslogic.driver.corporationblDriver.DriverInfocorporationblDriver;

import businesslogic.driver.formapprovalblDriver.CarInputFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.CarOfficeFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.DeliveryFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.OfficeArrivalFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.OrderFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.PaymentFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.ReceiptFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.StorageInFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.StorageOutFormFormapprovalblDriver;

import businesslogic.driver.formapprovalblDriver.StoreArrivalFormFormapprovalblDriver;
import businesslogic.driver.formapprovalblDriver.TransferFormFormapprovalblDriver;
import businesslogic.driver.transitblDriver.CarInputFormTransitblDriver;
import businesslogic.driver.transitblDriver.CarOfficeTransitblDriver;
import businesslogic.driver.transitblDriver.DeliveryFormTransitblDriver;
import businesslogic.driver.transitblDriver.OfficeArrivalFormTransitblDriver;
import businesslogic.driver.transitblDriver.OrderFormTransitblDriver;
import businesslogic.driver.transitblDriver.StoreArrivalFormTransitblDriver;
import businesslogic.driver.transitblDriver.TransferFormTransitblDriver;
import businesslogic.stub.formapprovalblStub.StorageOutFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.StoreArrivalFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.TransferFormFormapprovalblStub;
import businesslogic.stub.transitblStub.CarInputFormTransitblStub;
import businesslogic.stub.transitblStub.CarOfficeTransitblStub;
import businesslogic.stub.transitblStub.DeliveryFormTransitblStub;
import businesslogic.stub.transitblStub.OfficeArrivalFormTransitblStub;
import businesslogic.stub.transitblStub.OrderFormTransitblStub;
import businesslogic.stub.transitblStub.StoreArrivalFormTransitblStub;
import businesslogic.stub.transitblStub.TransferFormTransitblStub;
import businesslogic.stub.corporationblStub.CarInfocorporationblStub;
import businesslogic.stub.corporationblStub.DriverInfocorporationblStub;
import businesslogic.stub.formapprovalblStub.CarInputFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.CarOfficeFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.DeliveryFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.OfficeArrivalFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.OrderFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.PaymentFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.ReceiptFormFormapprovalblStub;
import businesslogic.stub.formapprovalblStub.StorageInFormFormapprovalblStub;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//测试constblservice
		//测试ConstInfoConstblService
//		ConstInfoConstblStub constInfoConstblStub = new ConstInfoConstblStub();
//		ConstInfoConstblDriver constInfoConstblDriver = new ConstInfoConstblDriver();
//		constInfoConstblDriver.driver(constInfoConstblStub);
//测试financeblservice
		//1.测试AccountInfoFinanceblService
//		AccountInfoFinanceblStub accountInfoFinanceblStub = new AccountInfoFinanceblStub();
//		AccountInfoFinanceblDriver accountInfoFinanceblDriver = new AccountInfoFinanceblDriver();
//		accountInfoFinanceblDriver.driver(accountInfoFinanceblStub);
		//2.测试PaymentFormFinanceblService
		PaymentFormFinanceblStub paymentFormFinanceblStub = new PaymentFormFinanceblStub();
		PaymentFormFinanceblDriver paymentFormFinanceblDriver = new PaymentFormFinanceblDriver();
		paymentFormFinanceblDriver.driver(paymentFormFinanceblStub);
		//3.测试ReceiptFormFinanceblService
//		ReceiptFormFinanceblStub receiptFormFinanceblStub = new ReceiptFormFinanceblStub();
//		ReceiptFormFinanceblDriver receiptFormFinanceblDriver = new ReceiptFormFinanceblDriver();
//		receiptFormFinanceblDriver.driver(receiptFormFinanceblStub);
//测试inventoryblService	
		//1.测试InventoryInfoInventoryblSercice
//		InventoryInfoInventoryblStub inventoryInfoInventoryblStub = new InventoryInfoInventoryblStub();
//		InventoryInfoInventoryblDriver inventoryInfoInventoryblDriver = new InventoryInfoInventoryblDriver();
//		inventoryInfoInventoryblDriver.driver(inventoryInfoInventoryblStub);
		//2.测试StorageInFormInventoryblService
//		StorageInFormInventoryblStub storageInFormInventoryblStub = new StorageInFormInventoryblStub();
//		StorageInFormInventoryblDriver storageInFormInventoryblDriver = new StorageInFormInventoryblDriver();
//		storageInFormInventoryblDriver.driver(storageInFormInventoryblStub);
		//3.测试StorageOutFormInventoryblService
//		StorageOutFormInventoryblStub storageOutFormInventoryblStub = new StorageOutFormInventoryblStub();
//		StorageOutFormInventoryblDriver storageOutFormInventoryblDriver = new StorageOutFormInventoryblDriver();
//		storageOutFormInventoryblDriver.driver(storageOutFormInventoryblStub);
//测试userblService
//测试UserInfoUserblService
//		UserInfoUserblStub userInfoUserblStub = new UserInfoUserblStub();
//		UserInfoUserblDriver userInfoUserblDriver = new UserInfoUserblDriver();
//		userInfoUserblDriver.driver(userInfoUserblStub);
//测试corporationblService
//		//1.测试CarInfocorporationblService
//		CarInfocorporationblStub carInfocorporationblStub = new CarInfocorporationblStub();
//		CarInfocorporationblDriver carInfocorporationblDriver = new CarInfocorporationblDriver();
//		carInfocorporationblDriver.drive(carInfocorporationblStub);
//		//2.测试DriverInfocorporationblService
//		DriverInfocorporationblStub driverInfocorporationblStub = new DriverInfocorporationblStub();
//		DriverInfocorporationblDriver driverInfocorporationblDriver = new DriverInfocorporationblDriver();
//		driverInfocorporationblDriver.drive(driverInfocorporationblStub);	
//测试FormapprovalblService
//		//1.测试CarInputFormFormapprovalblService
//		CarInputFormFormapprovalblStub carInputFormFormapprovalblStub  = new 
//				CarInputFormFormapprovalblStub();
//		CarInputFormFormapprovalblDriver carInputFormFormapprovalblDriver = new 
//				CarInputFormFormapprovalblDriver();
//		carInputFormFormapprovalblDriver.drive(carInputFormFormapprovalblStub);
		
//		//2.测试CarOfficeFormFormapprovalblService
//		CarOfficeFormFormapprovalblStub carOfficeFormFormapprovalblStub  = new 
//				CarOfficeFormFormapprovalblStub();
//		CarOfficeFormFormapprovalblDriver carOfficeFormFormapprovalblDriver = new 
//				CarOfficeFormFormapprovalblDriver();
//		carOfficeFormFormapprovalblDriver.drive(carOfficeFormFormapprovalblStub);
		
//		//3.测试DeliveryFormFormapprovalblService
//		DeliveryFormFormapprovalblStub deliveryFormFormapprovalblStub  = new 
//				DeliveryFormFormapprovalblStub();
//		DeliveryFormFormapprovalblDriver deliveryFormFormapprovalblDriver = new 
//				DeliveryFormFormapprovalblDriver();
//		deliveryFormFormapprovalblDriver.drive(deliveryFormFormapprovalblStub);
//		//4.测试OfficeArrivalFormFormapprovalblService
//		OfficeArrivalFormFormapprovalblStub officeArrivalFormFormapprovalblStub  = new 
//				OfficeArrivalFormFormapprovalblStub();
//		OfficeArrivalFormFormapprovalblDriver officeArrivalFormFormapprovalblDriver = new 
//				OfficeArrivalFormFormapprovalblDriver();
//		officeArrivalFormFormapprovalblDriver.drive(officeArrivalFormFormapprovalblStub);
		
//		//5.测试OrderFormFormapprovalblService
//		OrderFormFormapprovalblStub orderFormFormapprovalblStub  = new 
//				OrderFormFormapprovalblStub();
//		OrderFormFormapprovalblDriver orderFormFormapprovalblDriver = new 
//				OrderFormFormapprovalblDriver();
//		orderFormFormapprovalblDriver.drive(orderFormFormapprovalblStub);
		
//		//6.测试PaymentFormapprovalblService
//		PaymentFormFormapprovalblStub paymentFormFormapprovalblStub  = new 
//			PaymentFormFormapprovalblStub();
//		PaymentFormFormapprovalblDriver paymentFormFormapprovalblDriver = new 
//			PaymentFormFormapprovalblDriver();
//		paymentFormFormapprovalblDriver.drive(paymentFormFormapprovalblStub);
		
		//7.测试ReceiptFormapprovalblService
//		ReceiptFormFormapprovalblStub receiptFormFormapprovalblStub  = new 
//				ReceiptFormFormapprovalblStub();
//		ReceiptFormFormapprovalblDriver receiptFormFormapprovalblDriver = new 
//				ReceiptFormFormapprovalblDriver();
//		receiptFormFormapprovalblDriver.drive(receiptFormFormapprovalblStub);
		
//		//8.测试StorageInFormapprovalblService
//		StorageInFormFormapprovalblStub storageInFormFormapprovalblStub  = new 
//				StorageInFormFormapprovalblStub();
//		StorageInFormFormapprovalblDriver storageInFormFormapprovalblDriver = new 
//				StorageInFormFormapprovalblDriver();
//		storageInFormFormapprovalblDriver.drive(storageInFormFormapprovalblStub);
		
//		//9.测试StorageOutFormapprovalblService
//		StorageOutFormFormapprovalblStub storageOutFormFormapprovalblStub  = new 
//				StorageOutFormFormapprovalblStub();
//		StorageOutFormFormapprovalblDriver storageOutFormFormapprovalblDriver = new 
//				StorageOutFormFormapprovalblDriver();
//		storageOutFormFormapprovalblDriver.drive(storageOutFormFormapprovalblStub);
		
//		//10.测试StoreArrivalFormapprovalblService
//		StoreArrivalFormFormapprovalblStub storeArrivalFormFormapprovalblStub  = new 
//				StoreArrivalFormFormapprovalblStub();
//		StoreArrivalFormFormapprovalblDriver storeArrivalFormFormapprovalblDriver = new 
//				StoreArrivalFormFormapprovalblDriver();
//		storeArrivalFormFormapprovalblDriver.drive(storeArrivalFormFormapprovalblStub);
		
//		//11.测试TransferFormapprovalblService
//		TransferFormFormapprovalblStub transferFormFormapprovalblStub  = new 
//				TransferFormFormapprovalblStub();
//		TransferFormFormapprovalblDriver transferFormFormapprovalblDriver = new 
//				TransferFormFormapprovalblDriver();
//		transferFormFormapprovalblDriver.drive(transferFormFormapprovalblStub);
		
		
//测试TransitblService
//		//1.测试CarInputFormTransitblService
//		CarInputFormTransitblStub carInputFormTransitblStub  = new 
//				CarInputFormTransitblStub();
//		CarInputFormTransitblDriver carInputFormTransitblDriver = new 
//				CarInputFormTransitblDriver();
//		carInputFormTransitblDriver.drive(carInputFormTransitblStub);
		
//		//2.测试CarOfficeFormTransitblService
//		CarOfficeTransitblStub carOfficeTransitblStub  = new 
//				CarOfficeTransitblStub();
//		CarOfficeTransitblDriver carOfficeTransitblDriver = new 
//				CarOfficeTransitblDriver();
//		carOfficeTransitblDriver.drive(carOfficeTransitblStub);
		
//		//3.测试DeliveryTransitblService
//		DeliveryFormTransitblStub deliveryFormTransitblStub  = new 
//				DeliveryFormTransitblStub();
//		DeliveryFormTransitblDriver deliveryFormTransitblDriver = new 
//				DeliveryFormTransitblDriver();
//		deliveryFormTransitblDriver.drive(deliveryFormTransitblStub);
		
		//4.测试OfficeArrivalTransitblService
//		OfficeArrivalFormTransitblStub officeArrivalFormTransitblStub  = new 
//				OfficeArrivalFormTransitblStub();
//		OfficeArrivalFormTransitblDriver officeArrivalFormTransitblDriver = new 
//				OfficeArrivalFormTransitblDriver();
//		officeArrivalFormTransitblDriver.drive(officeArrivalFormTransitblStub);
		
		//5.测试OrderTransitblService
//		OrderFormTransitblStub orderFormTransitblStub  = new 
//				OrderFormTransitblStub();
//		OrderFormTransitblDriver orderFormTransitblDriver = new 
//				OrderFormTransitblDriver();
//		orderFormTransitblDriver.drive(orderFormTransitblStub);
		
		//6.测试StoreArrivalTransitblService
//		StoreArrivalFormTransitblStub storeArrivalFormTransitblStub  = new 
//				StoreArrivalFormTransitblStub();
//		StoreArrivalFormTransitblDriver storeArrivalFormTransitblDriver = new 
//				StoreArrivalFormTransitblDriver();
//		storeArrivalFormTransitblDriver.drive(storeArrivalFormTransitblStub);
		
		//7.测试TransferFormTransitblService
//		TransferFormTransitblStub transferFormTransitblStub  = new 
//				TransferFormTransitblStub();
//		TransferFormTransitblDriver transferFormTransitblDriver = new 
//				TransferFormTransitblDriver();
//		transferFormTransitblDriver.drive(transferFormTransitblStub);
				

	}

}