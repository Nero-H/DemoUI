package vo;

import java.util.ArrayList;
import java.util.Date;


public class CustomerGiftPromotionVO extends PromotionVO {

	
	Date startDate;
	Date endDate;
	ClientLevel customerlevel; //客户等级  ，customerLevel大于一，小于五
	ArrayList<GiftVO> gifts=new ArrayList<GiftVO>();
	PromotionType type=PromotionType.CustomerGift;
	
	public CustomerGiftPromotionVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ArrayList<GiftVO> getGifts() {
		return gifts;
	}


	public void setGifts(ArrayList<GiftVO> gifts) {
		this.gifts = gifts;
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

	public ClientLevel getCustomerlevel() {
		return customerlevel;
	}

	public void setCustomerlevel(ClientLevel customerlevel) {
		this.customerlevel = customerlevel;
	}

	public void delGoods(String id){
		
	}
	
	public void addGoods(GiftVO vo){
		
	}
	
	public PromotionType getType() {
		return type;
	}


	public void setType(PromotionType type) {
		this.type = type;
	}


}
