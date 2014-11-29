package vo;

public class PayVOLineItem {
	AccountVO account;
	double money;
	String comment;

	public PayVOLineItem(AccountVO account, double money, String comment) {
		this.account = account;
		this.money = money;
		this.comment = comment;
	}
}
