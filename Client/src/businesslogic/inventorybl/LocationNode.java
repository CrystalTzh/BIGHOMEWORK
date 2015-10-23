package businesslogic.inventorybl;

import state.NodeState;
import state.Zone;

public class LocationNode {
	Zone zone; //����
	int line; //�ź�
	int shelf; // �ܺ�
	int tag; //λ��
	long ID; //��Ӧλ�õĶ�����
	NodeState state; //ÿ��λ�õ�״̬

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
	//����Ҫ����������ʱ���Ͱѿղֿ��state��EMPTY�����ɶ�Ӧ�ķ�������setTag���������tag*2
	
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
