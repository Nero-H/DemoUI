package vo;

import java.util.ArrayList;

public class ReceiveVO {
	int clientNum;
	ArrayList<ReceiveVOLineItem> list;
	double sum;
	
	public ReceiveVO(int clientNum, ArrayList<ReceiveVOLineItem> ritemList) {
		this.clientNum = clientNum;
		this.list = ritemList;
	}
	
	public int getClient() {
		return clientNum;
	}
	public void setClient(int clientNum) {
		this.clientNum = clientNum;
	}
	public ArrayList<ReceiveVOLineItem> getList() {
		return list;
	}
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
}
