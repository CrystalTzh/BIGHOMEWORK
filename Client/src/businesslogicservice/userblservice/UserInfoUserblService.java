package businesslogicservice.userblservice;

import vo.UserInfoVO;

public interface UserInfoUserblService {
	public UserInfoVO create();
	public boolean add(UserInfoVO vo);
	public boolean delete(UserInfoVO vo);
	public UserInfoVO find(long userAccount);
	public UserInfoVO update();
	
	public boolean add (String userAccount, String password);
}
