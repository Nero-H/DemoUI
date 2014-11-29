package vo;

import utility.TimePeriod;

public class HistoryReportVO extends ReceiptVO{
	int type;
	TimePeriod period;
	
	public HistoryReportVO(int type, TimePeriod period) {
		this.type = type;
		this.period = period;
	}
}
