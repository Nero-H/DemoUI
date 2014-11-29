package utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePeriod {
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	Date before;
	Date after;
	public TimePeriod(String before , String after) throws Exception{
		try {
			this.before = format.parse(before);
			this.after = format.parse(after);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Date getBefore() {
		return before;
	}

	public void setBefore(Date before) {
		this.before = before;
	}

	public Date getAfter() {
		return after;
	}

	public void setAfter(Date after) {
		this.after = after;
	}

	public TimePeriod(Date before , Date after){
		this.before = before;
		this.after = after;
	}
	
	boolean isValid(){
		return before.before(after);
	}
	
	public boolean timeCheck(Date data){
		if (data.before(after) && data.after(before)) {
			return true;
		}else {
			return false;
		}
	}
}
