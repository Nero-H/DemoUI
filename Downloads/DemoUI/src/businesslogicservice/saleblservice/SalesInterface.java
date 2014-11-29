package businesslogicservice.saleblservice;

import java.util.ArrayList;

import po.SalesPO;
import po.SalesReturnPO;
import utility.TimePeriod;
import vo.SalesVO;

public interface SalesInterface {
	public ArrayList<SalesPO> multipleConditionFindSales(TimePeriod period,String goodsName,String clientId,String salesman,String storehouse);
	public ArrayList<SalesReturnPO> multipleConditionFindSalesReturn(TimePeriod period,String goodsName,String clientId,String salesman,String storehouse);
	public ArrayList<SalesPO> getSalesList();	//所有销售单
	public ArrayList<SalesReturnPO> getSalesReturnList();	//所有销售退货单
	public double getSalesIncome(TimePeriod period);	//一段时间内销售的收入
	public double getIncomeOfVoucherAndGain(TimePeriod period);	//一段时间内的代金券与实际收款的差
	public double getGiftPayout(TimePeriod period);	//一段时间内商品赠出的支出
	public void transform_SalesPOs_to_SalesVOs(ArrayList<SalesPO> pos,ArrayList<SalesVO> vos); //转换
}
