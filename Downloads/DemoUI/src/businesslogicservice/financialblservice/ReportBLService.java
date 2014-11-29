package businesslogicservice.financialblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import vo.CaseReportVO;
import vo.HistoryReportVO;
import vo.ReceiptVO;
import vo.SalesReportVO;
import vo.SalesVO;

public interface ReportBLService {
	
	public HashMap<String, Double> viewCaseReport(CaseReportVO vo) throws RemoteException;
	
	public ArrayList<Object> viewHistoryReport (HistoryReportVO vo) throws RemoteException;
	
	public ArrayList<SalesVO> viewSalesReport (SalesReportVO vo) throws RemoteException;
	
	public void hotStamp (ReceiptVO vo,boolean cpy) throws RemoteException;
}
