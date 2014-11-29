package vo;

import java.util.Date;


public class CustomerVoucherPromotionVO extends PromotionVO{

	Date startDate;
	Date endDate;
	ClientLevel customerLevel;
	double voucher;
	PromotionType type=PromotionType.CustomerVoucher;
	
	public CustomerVoucherPromotionVO() {
		// TODO Auto-generated constructor stub
	}
	
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

	
	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}


}
