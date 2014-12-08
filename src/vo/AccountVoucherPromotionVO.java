package vo;

import java.util.Date;


public class AccountVoucherPromotionVO extends PromotionVO {
	Date startDate;
	Date endDate;
	double account;
	double voucher;
	PromotionType type=PromotionType.AccountVoucher;
	
	public AccountVoucherPromotionVO() {
		// TODO Auto-generated constructor stub
	}
	
	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}

	public PromotionType getType() {
		return type;
	}

	public void setType(PromotionType type) {
		this.type = type;
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

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	

	public AccountVoucherPromotionVO(Date start,Date end,double a,double m){
		startDate=start;
		endDate=end;
		account=a;
		voucher=m;

	}
	
	

}
