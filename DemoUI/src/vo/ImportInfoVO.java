package vo;

import java.io.Serializable;

public class ImportInfoVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String operator;	//操作员
	String storehouse;	//仓库
	String notes;		//备注
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getStorehouse() {
		return storehouse;
	}
	public void setStorehouse(String storehouse) {
		this.storehouse = storehouse;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
