package vo;

import java.io.Serializable;

public class MoneyLineItemVO implements FinancialReceiptLineItemVO,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String accountId;
	double sum;
	String comment;

	public MoneyLineItemVO(String accountId, double sum, String comment) {
		this.accountId = accountId;
		this.sum = sum;
		this.comment = comment;
	}

	public String getAccountId() {
		return accountId;
	}

	public double getSum() {
		return sum;
	}

	public String getComment() {
		return comment;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
