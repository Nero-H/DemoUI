package vo;

public class MoneyItemVO {
	String accountId;
	double sum;
	String comment;

	public MoneyItemVO(String accountId, double sum, String comment) {
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
