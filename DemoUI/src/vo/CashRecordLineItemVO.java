package vo;

public class CashRecordLineItemVO {
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
	
	
}
