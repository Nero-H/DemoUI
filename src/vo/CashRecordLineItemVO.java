package vo;

public class CashRecordLineItemVO implements FinancialReceiptLineItemVO{
	String name;
	double sum;
	String comment;
	
	public CashRecordLineItemVO(String name, double sum, String comment) {
		super();
		this.name = name;
		this.sum = sum;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public double getSum() {
		return sum;
	}

	public String getComment() {
		return comment;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
