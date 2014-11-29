package vo;

public class ReceiveVOLineItem {
	AccountVO account;
	double money;
	String comment;

	public ReceiveVOLineItem(AccountVO account, double money, String comment) {
		this.account = account;
		this.money = money;
		this.comment = comment;
	}
}
