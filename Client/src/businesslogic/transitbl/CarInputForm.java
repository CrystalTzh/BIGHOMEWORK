package businesslogic.transitbl;

import businesslogicservice.transitblservice.CarInputFormTransitblService;
import vo.CarInputFormVO;

public class CarInputForm implements CarInputFormTransitblService{

	@Override
	public CarInputFormVO CarInputFormcreate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CarInputFormcancel(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean CarInputFormsave(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean CarInputFormsubmit(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CarInputFormwithdraw(CarInputFormVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

}
