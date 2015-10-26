package businesslogic.driver.userblDriver;

import vo.UserInfoVO;
import businesslogicservice.userblservice.UserInfoUserblService;

public class UserInfoUserblDriver {
	public void driver(UserInfoUserblService userInfoUserblStub){
		boolean isSuccessful = userInfoUserblStub.add("12345678", "abcdefg");
		UserInfoVO userInfoVO = new UserInfoVO();
		if(isSuccessful){
			System.out.println("The default account is "+userInfoVO.getUserAccount());
		}
	}
}
