package vo;

public class MoneyLineItemVO {
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
	
	
}
