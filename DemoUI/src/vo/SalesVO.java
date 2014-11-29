package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class SalesVO extends ReceiptVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//基本属性
	private	String receiptsID;	//单据编号
	private	String client;		//销售商
	private	String storehouse;	//仓库
	private String salesman;    //业务员
	private	String operator;	//操作员
	private ArrayList<GoodsInfoVO> goodsVOs = new ArrayList<GoodsInfoVO>();		//出货商品列表
	private ArrayList<GiftVO> giftList;
	private double beforeDiscount;	//折让前总额
	private double discount;		//折让
	private double afterDiscount;	//折让后总额
	private double voucher;	//生成的代金券金额
	private double ticketPrice;	//使用的代金券金额
	private String notes;		//备注
	private double total;		//总额
	private Date date;			//日期
	
	
	
	
	public ArrayList<GiftVO> getGiftList() {
		return giftList;
	}
	public void setGiftList(ArrayList<GiftVO> giftList) {
		this.giftList = giftList;
	}
	public String getReceiptsID() {
		return receiptsID;
	}
	public void setReceiptsID(String receiptsID) {
		this.receiptsID = receiptsID;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getStorehouse() {
		return storehouse;
	}
	public void setStorehouse(String storehouse) {
		this.storehouse = storehouse;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public ArrayList<GoodsInfoVO> getGoodsVOs() {
		return goodsVOs;
	}
	public void setGoodsVOs(ArrayList<GoodsInfoVO> goodsPOs) {
		this.goodsVOs = goodsPOs;
	}
	public double getBeforeDiscount() {
		return beforeDiscount;
	}
	public void setBeforeDiscount(double beforeDiscount) {
		this.beforeDiscount = beforeDiscount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getAfterDiscount() {
		return afterDiscount;
	}
	public void setAfterDiscount(double afterDiscount) {
		this.afterDiscount = afterDiscount;
	}
	public double getVoucher() {
		return voucher;
	}
	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
//--------------------------------------------------------

}
