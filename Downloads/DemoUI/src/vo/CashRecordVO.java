package vo;


public class CashRecordVO {
	String accountId;
	String itemName;//单个条目的名称
	String itemComment;//单个条目的备注
	double sum;//单个条目的金额

	public CashRecordVO(String accountId,
			String itemName,String itemComment) {
		this.accountId = accountId;
		this.itemName = itemName;
		this.itemComment = itemComment;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemComment() {
		return itemComment;
	}

	public void setItemComment(String itemComment) {
		this.itemComment = itemComment;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

}
