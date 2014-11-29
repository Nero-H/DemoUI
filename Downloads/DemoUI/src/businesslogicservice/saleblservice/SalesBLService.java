package businesslogicservice.saleblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.ClientVO;
import vo.GoodsVO;
import vo.SalesInfoVO;
import vo.SalesVO;

public interface SalesBLService extends Remote{
	public ArrayList<ClientVO> showClientList() throws RemoteException;	//显示客户列表
	public ArrayList<GoodsVO> showGoodsList() throws RemoteException;	//显示商品列表
	public boolean addClient(ClientVO vo) throws RemoteException;	//添加销售商
	public boolean removeClient() throws RemoteException;			//remove client
	public boolean addGoods(String loc, int number, double unitPrice, String notes) throws RemoteException;	//添加销售商品
	public boolean removeGoods(int loc) throws RemoteException;
	public boolean addOtherInfo(SalesInfoVO vo) throws RemoteException;
	public ArrayList<SalesVO> showSales() throws RemoteException;	//显示销售单
	public boolean salesReturn(int loc) throws RemoteException;	//销售的退货
	public double getTotal() throws RemoteException;	//计算总价
	public boolean creatSales() throws RemoteException;//生成销售单
	public void endSales() throws RemoteException;	//结束销售回合
}
