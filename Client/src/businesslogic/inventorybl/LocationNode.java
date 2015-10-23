package businesslogic.inventorybl;

import state.NodeState;
import state.Zone;

public class LocationNode {
	Zone zone; //区号
	int line; //排号
	int shelf; // 架号
	int tag; //位号
	long ID; //对应位置的订单号
	NodeState state; //每个位置的状态

	public Zone getZone() {
		return zone;
	}

	public int getLine() {
		return line;
	}

	public int getShelf() {
		return shelf;
	}

	public int getTag() {
		return tag;
	}

	public NodeState getState() {
		return state;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
	//当需要调整库存分区时，就把空仓库的state从EMPTY调整成对应的分区，在setTag方法里面的tag*2
	
	public void setState(NodeState state) {
		this.state = state;
	}
	
	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
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
	public NodeState opposite(NodeState state){
		
		if(state == NodeState.TAKEN){
			state = NodeState.VACANT;
		}else if(state == NodeState.VACANT){
			state = NodeState.TAKEN;
		}
		return state;
		
	}
	
}
