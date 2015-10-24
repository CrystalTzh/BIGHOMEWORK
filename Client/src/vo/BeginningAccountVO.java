package vo;

import java.io.Serializable;
import java.util.ArrayList;

public class BeginningAccountVO implements Serializable{
	int year;//建立年份
	ArrayList<UserInfoVO> userInfo;//当前机构人员账户信息
	ArrayList<CarInfoVO> carInfo;//车辆信息
	ArrayList<InventoryInfoVO> inventoryInfo;//库存信息
	AccountInfoVO accountInfo;//银行账户信息
	
	public BeginningAccountVO(int year,
			ArrayList<UserInfoVO> userInfo,
			ArrayList<CarInfoVO> carInfo,
			ArrayList<InventoryInfoVO> inventoryInfo,
			AccountInfoVO accountInfo) {
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


	public ArrayList<UserPO> getUserInfo() {
		return userInfo;
	}

	public ArrayList<CarInfoPO> getCarInfo() {
		return carInfo;
	}

	public ArrayList<InventoryInfoPO> getInventoryInfo() {
		return inventoryInfo;
	}

	public AccountPO getAccountInfo() {
		return accountInfo;
	}

	public void setUserInfo(ArrayList<UserPO> userInfo) {
		this.userInfo = userInfo;
	}

	public void setCarInfo(ArrayList<CarInfoPO> carInfo) {
		this.carInfo = carInfo;
	}

	public void setInventoryInfo(ArrayList<InventoryInfoPO> inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	public void setAccountInfo(AccountPO accountInfo) {
		this.accountInfo = accountInfo;
	}
	
}
