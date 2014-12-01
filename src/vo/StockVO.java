package vo;

import java.sql.Date;

public class StockVO {

	Date date ;
	String nameString ;
	String modelNum ;
	boolean state;
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public void setPerPrice(double perPrice) {
		this.perPrice = perPrice;
	}
	int number ;
	double perPrice ;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getModelNum() {
		return modelNum;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPerPrice() {
		return perPrice;
	}
	public void setPerPrice(int perPrice) {
		this.perPrice = perPrice;
	}
}
