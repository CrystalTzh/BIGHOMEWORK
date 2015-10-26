package businesslogic.stub.userblStub;

import vo.UserInfoVO;
import businesslogicservice.userblservice.UserInfoUserblService;

public class UserInfoUserblStub implements UserInfoUserblService {

	@Override
	public UserInfoVO create() {
		// TODO Auto-generated method stub
		System.out.println("call UserInfocreat...");
		return null;
	}

	@Override
	public boolean add(UserInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoadd...");
		return false;
	}

	@Override
	public boolean delete(UserInfoVO vo) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfodelete...");
		return false;
	}

	@Override
	public UserInfoVO find(long userAccount) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfofind...");
		return null;
	}

	@Override
	public UserInfoVO update() {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoupdate...");
		return null;
	}

	@Override
	public boolean add(String userAccount, String password) {
		// TODO Auto-generated method stub
		System.out.println("call UserInfoaddInfo...");
		return true;
	}

}
