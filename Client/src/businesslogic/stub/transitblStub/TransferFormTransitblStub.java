package businesslogic.stub.transitblStub;

import businesslogicservice.transitblservice.TransferFormblService;
import vo.TransferFormVO;

public class TransferFormTransitblStub implements TransferFormblService{

	@Override
	public TransferFormVO TransferFormcreate() {
		// TODO Auto-generated method stub
		System.out.println("Call TransferFormcreate...");
		return null;
	}

	@Override
	public void TransferFormcancel(TransferFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call TransferFormcancel...");
	}

	@Override
	public boolean TransferFormsave(TransferFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call TransferFormsave...");
		return false;
	}

	@Override
	public boolean TransferFormsubmit(TransferFormVO vo) {
		// TODO print "Submit TransferForm successfully!"
		System.out.println("Call TransferFormsubmit...");
		return true;
	}

	@Override
	public boolean TransferFormwithdraw(TransferFormVO vo) {
		// TODO Auto-generated method stub
		System.out.println("Call TransferFormwithdraw...");
		return false;
	}

}
