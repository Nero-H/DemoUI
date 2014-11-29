package vo;

public class UpdateAccountVO {
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
