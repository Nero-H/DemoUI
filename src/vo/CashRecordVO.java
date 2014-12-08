package vo;

import java.io.Serializable;
import java.util.ArrayList;

//用于BL层向UI层传搜索结果
public class CashRecordVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String accountName;
	ArrayList<CashRecordLineItemVO> list;
	double sum;
	String serialNumber;
	String userName;
	public CashRecordVO(String accountName,
			ArrayList<CashRecordLineItemVO> list, double sum,
			String serialNumber, String userName) {
		super();
		this.accountName = accountName;
		this.list = list;
		this.sum = sum;
		this.serialNumber = serialNumber;
		this.userName = userName;
	}
	public String getAccountName() {
		return accountName;
	}
	public ArrayList<CashRecordLineItemVO> getList() {
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
