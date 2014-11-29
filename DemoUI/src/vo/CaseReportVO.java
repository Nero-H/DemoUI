package vo;

import utility.TimePeriod;

public class CaseReportVO {
	TimePeriod period;
	public CaseReportVO(TimePeriod period){
		this.period = period;
	}
	
	public TimePeriod getPeriod() {
		return period;
	}
}
