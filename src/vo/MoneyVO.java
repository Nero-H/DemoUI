package vo;

import java.io.Serializable;
import java.util.ArrayList;

public interface MoneyVO extends Serializable{
	public String getClientName();
	public ArrayList<MoneyLineItemVO> getList(); 
	public double getSum();
	public String getSerialNumber();
	public String getUserName();
}
