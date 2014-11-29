package vo;

import java.sql.Date;
import java.util.ArrayList;


public class AccountGiftPromotionVO extends PromotionVO {

	
	Date startDate;
	Date endDate;
	double account; 
	ArrayList<GiftVO> gifts=new ArrayList<GiftVO>();
	PromotionType type=PromotionType.AccountGift;
	
	public ArrayList<GiftVO> getGifts() {
		return gifts;
	}


	public void setGifts(ArrayList<GiftVO> gifts) {
		this.gifts = gifts;
	}




	public AccountGiftPromotionVO() {
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


	public void delGoods(String id){
		
	}
	
	
	public void addGoods(GiftVO vo){
		
	}
	
	
}
