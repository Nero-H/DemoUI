package vo;

import java.rmi.RemoteException;

import utility.MyTreeNode;

public class GoodsVO extends MyTreeNode{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String goodsName;
	String goodsModelNumber;
	int stockNumber;
	double inPrice;
	double retailPrice;
	double recentPrice;
	double recentRetailPrice;
	int warningNumber ;
	
	
	
	public GoodsVO(String goodsNumber, String goodsName,
			String goodsModelNumber, double inPrice, double retailPrice) throws RemoteException {
		super(goodsNumber);
		this.goodsName = goodsName;
		this.goodsModelNumber = goodsModelNumber;
		this.inPrice = inPrice;
		this.retailPrice = retailPrice;
	}

	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsModelNumber() {
		return goodsModelNumber;
	}
	public void setGoodsModelNumber(String goodsModelNumber) {
		this.goodsModelNumber = goodsModelNumber;
	}
	public int getStockNumber() {
		return stockNumber;
	}
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	public double getInPrice() {
		return inPrice;
	}
	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}
	public double getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}
	public double getRecentPrice() {
		return recentPrice;
	}
	public void setRecentPrice(int recentPrice) {
		this.recentPrice = recentPrice;
	}
	public double getRecentRetailPrice() {
		return recentRetailPrice;
	}
	public void setRecentRetailPrice(int recentRetailPrice) {
		this.recentRetailPrice = recentRetailPrice;
	}
	
	public String toString(){
		return goodsName;
	}
	
}
