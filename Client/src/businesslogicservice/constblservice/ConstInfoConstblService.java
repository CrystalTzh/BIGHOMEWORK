package businesslogicservice.constblservice;

import po.ConstPO;
import vo.ConstInfoVO;

public interface ConstInfoConstblService {
	
	public ConstInfoVO find();
	
	public ConstPO update(ConstInfoVO vo);
}
