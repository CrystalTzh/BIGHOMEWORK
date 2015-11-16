package businesslogic.driver.constblDriver;

import po.ConstPO;
import vo.ConstInfoVO;
import businesslogicservice.constblservice.ConstInfoConstblService;

public class ConstInfoConstblDriver {
	public void driver(ConstInfoConstblService constInfoConstblStub){
		ConstInfoVO constInfoVO1 = constInfoConstblStub.find();
		double baseSalary = constInfoVO1.getBaseSalary();
		System.out.println("The baseSalary is "+baseSalary);
		ConstPO constInfoPO2 = constInfoConstblStub.update(constInfoVO1);
	
	}
}
