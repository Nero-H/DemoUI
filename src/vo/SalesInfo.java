package vo;

import java.io.Serializable;

public class SalesInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double discount;
	private double afterDiscount;
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getAfterDiscount() {
		return afterDiscount;
	}
	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	
	
}
