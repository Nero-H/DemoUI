package vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ImportVO extends ReceiptVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//基本的属性
	private	String receiptsID;	//单据编号
	private	String client;		//供应商
	private	String storehouse;	//仓库
	private	String operator;	//操作员
	private	ArrayList<GoodsInfoVO> goodsVOs = new ArrayList<GoodsInfoVO>();		//入库商品列表
	private	String notes;		//备注
	private	double total;		//总额
	private Date date;			//日期
		
	public String getReceiptsID() {
		return receiptsID;
	}
		
	public String getClient() {
		return client;
	}
	
	public String getStorehouse() {
		return storehouse;
	}
		
	public String getOperator() {
		return operator;
	}
		
	public ArrayList<GoodsInfoVO> getGoodsVOs() {
		return goodsVOs;
	}
		
	public String getNotes() {
		return notes;
	}
	
	public double getTotal() {
		return total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setReceiptsID(String receiptsID) {
		this.receiptsID = receiptsID;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public void setStorehouse(String storehouse) {
		this.storehouse = storehouse;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setGoodsVOs(ArrayList<GoodsInfoVO> goodsVOs) {
		this.goodsVOs = goodsVOs;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
