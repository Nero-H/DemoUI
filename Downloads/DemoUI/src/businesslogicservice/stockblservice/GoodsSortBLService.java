package businesslogicservice.stockblservice;

import java.rmi.RemoteException;

import vo.GoodsSortVO;

public interface GoodsSortBLService {
	public boolean addGoodsSort (GoodsSortVO vo) throws RemoteException;
	public boolean deleteGoodsSort (GoodsSortVO vo ) throws RemoteException;
	public boolean updateGoodsSort (GoodsSortVO vo) throws RemoteException;
	public GoodsSortVO findGoodsSort (String ID) throws RemoteException;
	


}
