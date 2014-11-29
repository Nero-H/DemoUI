package vo;

import java.util.ArrayList;

public class ReceiveVO {
	String clientName;
	ArrayList<MoneyLineItemVO> list;
	double sum;
	String serialNumber;
	String userName;
	public ReceiveVO(String clientName, ArrayList<MoneyLineItemVO> list,
			double sum, String serialNumber, String userName) {
		super();
		this.clientName = clientName;
		this.list = list;
		this.sum = sum;
		this.serialNumber = serialNumber;
		this.userName = userName;
	}
	public String getClientName() {
		return clientName;
	}
	public ArrayList<MoneyLineItemVO> getList() {
		return list;
	}
	public double getSum() {
		return sum;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public String getUserName() {
		return userName;
	}
	
	
}
