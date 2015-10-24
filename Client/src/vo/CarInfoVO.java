package vo;

import java.io.Serializable;

public class CarInfoVO implements Serializable{
	String carNumber;
	String plateNumber;
	String engineNUmber;
	String chassisNumber;
	String buyTime;
	String activeTime;
	
	public CarInfoVO(String c,String p,String e,String ch,String b,String a){
		carNumber = c;
		plateNumber = p;
		engineNUmber = e;
		chassisNumber = ch;
		buyTime = b;
		activeTime = a;
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
}
