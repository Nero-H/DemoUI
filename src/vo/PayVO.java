package vo;

import java.util.ArrayList;

public class PayVO {
	int clientNum;
	ArrayList<PayVOLineItem> list;
	double sum;
	
	public PayVO(int clientNum, ArrayList<PayVOLineItem> list) {
		this.clientNum = clientNum;
		this.list = list;
	}
	
	public int getClient() {
		return clientNum;
	}
	public void setClient(int clientNum) {
		this.clientNum = clientNum;
	}
	public ArrayList<PayVOLineItem> getList() {
		return list;
	}
	public void setList(ArrayList<PayVOLineItem> list) {
		this.list = list;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
}
