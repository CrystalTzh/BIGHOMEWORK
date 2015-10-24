package businesslogicservice.corporationblservice;

import vo.CarInfoVO;

public interface CarInfocorporationblService {
	public CarInfoVO create();
	public boolean add(CarInfoVO vo);
	public boolean delete(CarInfoVO vo);
	public CarInfoVO find(String carNumber);
	public CarInfoVO update();
}
