package vo;

import java.io.Serializable;

public class SalesInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String operator;	//操作员
	String salesman;	//业务员
	String storehouse;	//仓库
//	double diccount;	//折让
	double voucher;//代金券金额
	String notes;		//备注
	
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public String getSalesman() {
		return salesman;
	}
	
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	
	public String getStorehouse() {
		return storehouse;
	}
	
	public void setStorehouse(String storehouse) {
		this.storehouse = storehouse;
	}
	
	public double getVoucher() {
		return voucher;
	}
	
	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
