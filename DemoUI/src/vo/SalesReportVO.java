package vo;

import utility.TimePeriod;

public class SalesReportVO {
	TimePeriod period;
	String goodName;
	String clientName;
	String salesMan;
	String wareHouse;
	public SalesReportVO(TimePeriod period, String goodName, String clientName,
			String salesMan, String wareHouse) {
		super();
		this.period = period;
		this.goodName = goodName;
		this.clientName = clientName;
		this.salesMan = salesMan;
		this.wareHouse = wareHouse;
	}
	public TimePeriod getPeriod() {
		return period;
	}
	public String getGoodName() {
		return goodName;
	}
	public String getClientName() {
		return clientName;
	}
	public String getSalesMan(){
		return salesMan;
	}
	public String getWareHouse() {
		return wareHouse;
	}
	
}
