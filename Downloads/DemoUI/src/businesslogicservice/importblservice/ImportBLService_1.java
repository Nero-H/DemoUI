package businesslogicservice.importblservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.ClientVO;
import vo.GoodsVO;
import vo.ImportInfoVO;
import vo.ImportVO;

public interface ImportBLService extends Remote{
	public ArrayList<ClientVO> showClientList() throws RemoteException;	//显示客户列表
	public ArrayList<GoodsVO> showGoodsList() throws RemoteException;	//显示商品列表
	public boolean addClient(ClientVO vo) throws RemoteException;	//添加供应商
	public boolean removeClient() throws RemoteException;			//remove client
	public boolean addGoods(String loc, int number, double unitPrice, String notes) throws RemoteException;	//添加进货商品
	public boolean removeGoods(int loc) throws RemoteException;
	public boolean addOtherInfo(ImportInfoVO vo) throws RemoteException;
	public ArrayList<ImportVO> showImport() throws RemoteException;	//显示进货单
	public ArrayList<ImportVO> showImportReturn() throws RemoteException;	//显示进货退货单
	public boolean importReturn(int loc) throws RemoteException;	//进货的退货
	public double getTotal() throws RemoteException;	//计算总价
	public boolean creatImport() throws RemoteException;//生成进货单
	public void endImport() throws RemoteException;	//结束进货回合
}
