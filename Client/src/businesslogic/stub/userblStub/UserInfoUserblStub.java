package businesslogic.stub.userblStub;

import vo.UserInfoVO;
import businesslogicservice.userblservice.UserInfoUserblService;

public class UserInfoUserblStub implements UserInfoUserblService {

	@Override
	public UserInfoVO create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserInfoVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfoVO find(long userAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoVO update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(long userAccount, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
