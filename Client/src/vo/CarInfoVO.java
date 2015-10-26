package vo;

import java.io.Serializable;

import state.FormState;

public class CarInfoVO implements Serializable{
	String carNumber;
	String plateNumber;
	String engineNUmber;
	String chassisNumber;
	String buyTime;
	String activeTime;
	
	public CarInfoVO() {}
	
	public CarInfoVO(String c,String p,String e,String ch,String b,String a){
		carNumber = c;
		plateNumber = p;
		engineNUmber = e;
		chassisNumber = ch;
		buyTime = b;
		activeTime = a;
//		this.formstate = formstate;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public String getEngineNUmber() {
		return engineNUmber;
	}
	
	public String getChassisNumber() {
		return chassisNumber;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public String getActiveTime() {
		return activeTime;
	}

//	public FormState getFormstate() {
//		return formstate;
//	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public void setEngineNUmber(String engineNUmber) {
		this.engineNUmber = engineNUmber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}
//
//	public void setFormstate(FormState formstate) {
//		this.formstate = formstate;
//	}
	
}
