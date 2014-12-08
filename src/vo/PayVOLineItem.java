package vo;

import java.io.Serializable;

public class PayVOLineItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AccountVO account;
	double money;
	String comment;

	public PayVOLineItem(AccountVO account, double money, String comment) {
		this.account = account;
		this.money = money;
		this.comment = comment;
	}
}
