package po;

import java.io.Serializable;
import java.util.ArrayList;

public class BeginningAccountPO implements Serializable{
	int year;//建立年份
	ArrayList<UserInfoPO> userInfo;//当前机构人员账户信息
	ArrayList<CarInfoPO> carInfo;//车辆信息
	ArrayList<InventoryInfoPO> inventoryInfo;//库存信息
	AccountInfoPO accountInfo;//银行账户信息
	
	public BeginningAccountPO(int year,
			ArrayList<UserInfoPO> userInfo,
			ArrayList<CarInfoPO> carInfo,
			ArrayList<InventoryInfoPO> inventoryInfo,
			AccountInfoPO accountInfo) {
		this.userInfo = userInfo;
		this.carInfo = carInfo;
		this.inventoryInfo = inventoryInfo;
		this.accountInfo = accountInfo;
	}

	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public ArrayList<UserInfoPO> getUserInfo() {
		return userInfo;
	}

	public ArrayList<CarInfoPO> getCarInfo() {
		return carInfo;
	}

	public ArrayList<InventoryInfoPO> getInventoryInfo() {
		return inventoryInfo;
	}

	public AccountInfoPO getAccountInfo() {
		return accountInfo;
	}

	public void setUserInfo(ArrayList<UserInfoPO> userInfo) {
		this.userInfo = userInfo;
	}

	public void setCarInfo(ArrayList<CarInfoPO> carInfo) {
		this.carInfo = carInfo;
	}

	public void setInventoryInfo(ArrayList<InventoryInfoPO> inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	public void setAccountInfo(AccountInfoPO accountInfo) {
		this.accountInfo = accountInfo;
	}
	
}
