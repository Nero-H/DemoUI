package vo;

import java.io.Serializable;

public class UpdateAccountVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String oldName;
	String newName;
	
	public UpdateAccountVO(String oldName, String newName) {
		super();
		this.oldName = oldName;
		this.newName = newName;
	}

	public String getOldName() {
		return oldName;
	}

	public String getNewName() {
		return newName;
	}
	
	
}
