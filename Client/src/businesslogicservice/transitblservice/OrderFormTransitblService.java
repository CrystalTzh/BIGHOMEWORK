package businesslogicservice.transitblservice;

import java.util.ArrayList;

import state.ExpressType;
import vo.OrderFormVO;

public interface OrderFormTransitblService {

	public boolean addOrderer(String name,String address,String company,String tel,String mobiletel);
	
	public boolean addReceiver(String name,String address,String company,String tel,String mobiletel);
	
	public boolean addGoodsInfo(int number,double weight,double size,String name);
	
	public boolean chooseType(ExpressType type);
	
	public boolean addPackingCharges(double packingCharges);
	
	public boolean addCaculateCost(double packingCharges);
	
	public boolean addID(long ID);
	
	public boolean addRealReceiveInfo (String name, String date);
	
	public OrderFormVO checkQuery(long ID);
	
	public boolean OrderFormcancel();
	
	public boolean OrderFormdelete();
	
	public boolean OrderFormwithdraw();
	
}
