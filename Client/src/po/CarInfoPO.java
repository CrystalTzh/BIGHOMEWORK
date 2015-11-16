package po;

import java.io.Serializable;

public class CarInfoPO implements Serializable{
	String carNumber;//车辆代号
	String plateNumber;//车牌号
	String engineNUmber;//发动机编号
	String chassisNumber;//底盘号
	String buyTime;
	String activeTime;
	//状态 要不要加？？？
	
	public CarInfoPO(String c,String p,String e,String ch,String b,String a){
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
