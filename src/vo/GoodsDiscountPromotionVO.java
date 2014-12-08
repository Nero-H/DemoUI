package vo;

import java.util.Date;
import java.util.ArrayList;


public class GoodsDiscountPromotionVO extends PromotionVO{

	Date startDate;
	Date endDate;
	double discount;
	ArrayList<GiftVO> goods= new ArrayList<GiftVO>();
	PromotionType type=PromotionType.GoodsDiscount;
	
	public GoodsDiscountPromotionVO() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<GiftVO> getGoods() {
		return goods;
	}


	public PromotionType getType() {
		return type;
	}

	public void setType(PromotionType type) {
		this.type = type;
	}

	public void setGoods(ArrayList<GiftVO> goods) {
		this.goods = goods;
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


	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void delGoods(String id){
		
	}
	
	public void addGoods(GiftVO po){
		
	}
	
}
