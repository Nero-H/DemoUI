package vo;

import java.io.Serializable;

public class GoodsInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String num;		//编号
	private String name;	//名称
	private String model;	//型号
	private int number;		//数量
	private double unitPrice;	//单价
	private double sum;		//总价
	private String notes;	//备注
	
	
	public String getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getSum() {
		return sum;
	}
	
	public String getNotes() {
		return notes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
