package vo;

import java.io.Serializable;
import java.util.ArrayList;

import state.FormState;

public class BeginningAccountVO implements Serializable{
	int year;//建立年份
	ArrayList<UserInfoVO> userInfo;//当前机构人员账户信息
	ArrayList<CarInfoVO> carInfo;//车辆信息
	ArrayList<InventoryInfoVO> inventoryInfo;//库存信息
	AccountInfoVO accountInfo;//银行账户信息
	FormState formstate;//单据的状态
	
	
	public BeginningAccountVO(int year,
			ArrayList<UserInfoVO> userInfo,
			ArrayList<CarInfoVO> carInfo,
			ArrayList<InventoryInfoVO> inventoryInfo,
			AccountInfoVO accountInfo, FormState formstate) {
		this.userInfo = userInfo;
		this.carInfo = carInfo;
		this.inventoryInfo = inventoryInfo;
		this.accountInfo = accountInfo;
		this.formstate = formstate;
	}

	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<UserInfoVO> getUserInfo() {
		return userInfo;
	}

	public ArrayList<CarInfoVO> getCarInfo() {
		return carInfo;
	}

	public ArrayList<InventoryInfoVO> getInventoryInfo() {
		return inventoryInfo;
	}

	public AccountInfoVO getAccountInfo() {
		return accountInfo;
	}

	public void setUserInfo(ArrayList<UserInfoVO> userInfo) {
		this.userInfo = userInfo;
	}

	public void setCarInfo(ArrayList<CarInfoVO> carInfo) {
		this.carInfo = carInfo;
	}

	public void setInventoryInfo(ArrayList<InventoryInfoVO> inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	public void setAccountInfo(AccountInfoVO accountInfo) {
		this.accountInfo = accountInfo;
	}


	public FormState getFormstate() {
		return formstate;
	}


	public void setFormstate(FormState formstate) {
		this.formstate = formstate;
	}
	
	
	
}
