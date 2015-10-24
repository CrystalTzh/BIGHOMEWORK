package businesslogic.inventorybl;

import java.util.ArrayList;

import state.NodeState;
import state.Zone;

public class PLANENode extends LocationNode {

	public PLANENode(int line, int shelf, int tag, long ID) {
		
		// TODO Auto-generated constructor stub
		this.zone = Zone.PLANE;
		this.state = NodeState.VACANT;
		this.line = line;
		this.shelf = shelf;
		this.tag = tag;
		this.ID = ID;
		
	}
	public NodeState add(long ID){
		NodeState currentState = getState();
		currentState = opposite(currentState);
	
		return currentState;	
	}

	public NodeState remove(long ID){
		NodeState currentState = getState();
		currentState = opposite(currentState);
		return currentState;	
	}
	
}
