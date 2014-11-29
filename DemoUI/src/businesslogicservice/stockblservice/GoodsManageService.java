package businesslogicservice.stockblservice;

import java.rmi.RemoteException;

import vo.GoodsVO;


public interface GoodsManageService {
	public boolean addGoods(GoodsVO vo) throws RemoteException;
	public boolean deleteGoods(GoodsVO vo ) throws RemoteException;
	public boolean updateGoods (GoodsVO vo) throws RemoteException;
	public GoodsVO findGoods(String ID) throws RemoteException;
	
}
