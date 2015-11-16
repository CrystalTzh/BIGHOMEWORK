package businesslogic.constbl;

import po.ConstPO;
import vo.ConstInfoVO;
import businesslogicservice.constblservice.ConstInfoConstblService;

public class ConstController implements ConstInfoConstblService{

	@Override
	public ConstInfoVO find() {
		// TODO Auto-generated method stub
		ConstInfoVO constInfoVO = new ConstInfoVO();
		return constInfoVO;
	}

	@Override
	public ConstPO update(ConstInfoVO constInfovo) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
