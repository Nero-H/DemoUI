package vo;

import java.sql.Date;


public class AccountVoucherPromotionVO extends PromotionVO {
	Date startDate;
	Date endDate;
	double account;
	double money;
	PromotionType type=PromotionType.AccountVoucher;

	public AccountVoucherPromotionVO() {
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

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}


	public AccountVoucherPromotionVO(Date start,Date end,double a,double m){
		startDate=start;
		endDate=end;
		account=a;
		money=m;

	}
	
	

}
