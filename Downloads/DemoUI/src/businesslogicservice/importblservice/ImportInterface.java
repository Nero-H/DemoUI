package businesslogicservice.importblservice;

import java.util.ArrayList;

import po.ImportPO;
import po.ImportReturnPO;
import utility.TimePeriod;

public interface ImportInterface {
	public ArrayList<ImportPO> getImportList();	//获得所有的进货单
	public ArrayList<ImportReturnPO> getImportReturnList();	//获得所有的进货退货单
	public ArrayList<ImportPO> multipleConditionFindImport(TimePeriod period,String goodsName,String clientId,String storehouse);
	public ArrayList<ImportReturnPO> multipleConditionFindImportReturn(TimePeriod period,String goodsName,String clientId,String storehouse);
	public double getAllPayout(TimePeriod period);	//一段时间内销售成本
}
