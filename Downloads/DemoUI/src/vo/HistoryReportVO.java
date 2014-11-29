package vo;

import utility.TimePeriod;

public class HistoryReportVO extends ReceiptVO{
	HistoryReportType type;
	TimePeriod period;
	String clientName;
	String wareHouse;
	String salesMan;
	String userName;
	String accountName;
	
	public HistoryReportVO(HistoryReportType type, TimePeriod period,
			String clientName, String wareHouse,String salesMan,String userName,String accountName) {
		super();
		this.type = type;
		this.period = period;
		this.clientName = clientName;
		this.wareHouse = wareHouse;
		this.salesMan = salesMan;
		this.userName = userName;
		this.accountName = accountName;
	}
	
	public String getAccountName(){
		return accountName;
	}

	public String getUserName(){
		return userName;
	}
	
	public HistoryReportType getHistoryReportType() {
		return type;
	}

	public TimePeriod getPeriod() {
		return period;
	}

	public String getClientName() {
		return clientName;
	}

	public String getWareHouse() {
		return wareHouse;
	}
	
	public String getSalesMan(){
		return salesMan;
	}
	
}
