package vo;

import java.util.Date;


public class CustomerDiscountPromotionVO extends PromotionVO{

	Date startDate;
	Date endDate;
	ClientLevel customerLevel;
	double discount;
	PromotionType type=PromotionType.CustomerDiscount;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ClientLevel getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(ClientLevel customerLevel) {
		this.customerLevel = customerLevel;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	
	
}
