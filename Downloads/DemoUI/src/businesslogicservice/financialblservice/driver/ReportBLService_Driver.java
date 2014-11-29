package businesslogicservice.financialblservice.driver;

import java.rmi.RemoteException;

import utility.TimePeriod;
import vo.CaseReportVO;
import vo.HistoryReportType;
import vo.HistoryReportVO;
import businesslogic.financialbl.stub.ReportManegerStub;
import businesslogicservice.financialblservice.ReportBLService;

public class ReportBLService_Driver {
	public void drive(ReportBLService reportBLService){
		TimePeriod period = null;
		try {
			period = new TimePeriod("2014-3-21","2014-7-12");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CaseReportVO caseReportVO = new CaseReportVO(period);
		try {
			reportBLService.viewCaseReport(caseReportVO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HistoryReportVO historyReportVO = new HistoryReportVO(HistoryReportType.FINANCIAL, period, "clientName", "wareHouse", "salesMan", "userName", "accountName");
		try {
			reportBLService.viewHistoryReport(historyReportVO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		historyReportVO = new HistoryReportVO(HistoryReportType.FINANCIAL, period, "clientName", "wareHouse", "salesMan", "userName", "accountName");
		try {
			reportBLService.viewHistoryReport(historyReportVO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		historyReportVO = new HistoryReportVO(HistoryReportType.FINANCIAL, period, "clientName", "wareHouse", "salesMan", "userName", "accountName");
		try {
			reportBLService.viewHistoryReport(historyReportVO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		historyReportVO = new HistoryReportVO(HistoryReportType.FINANCIAL, period, "clientName", "wareHouse", "salesMan", "userName", "accountName");
		try {
			reportBLService.viewHistoryReport(historyReportVO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HistoryReportVO historyReport = null;
		try {
			historyReport = new HistoryReportVO(HistoryReportType.FINANCIAL, period, "clientName", "wareHouse", "salesMan", "userName", "accountName");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			reportBLService.hotStamp(historyReport, true);
			reportBLService.hotStamp(historyReport, false);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ReportBLService_Driver driver = new ReportBLService_Driver();
		ReportBLService reportBLService = new ReportManegerStub();
		driver.drive(reportBLService);
	}
}
