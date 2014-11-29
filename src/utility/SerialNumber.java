package utility;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SerialNumber implements Containsable{
	String serialNumber;
	public static String getSerialNumber(String prefix, int number){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date today = new Date(System.currentTimeMillis());
		String temp = format.format(today);
		//得到一个NumberFormat的实例
        NumberFormat nf = NumberFormat.getInstance();
        //设置是否使用分组
        nf.setGroupingUsed(false);
        //设置最大整数位数
        nf.setMaximumIntegerDigits(5);
        //设置最小整数位数    
        nf.setMinimumIntegerDigits(5);
        prefix = prefix + temp + nf.format(number);
		return prefix;
	}
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return serialNumber.contains(key);
	}
}
