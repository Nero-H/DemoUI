package vo;

public class UserVO {
	String name;
	String id;
	String passward;

	public UserVO(String name, String id, String passward) {
		this.name = name;
		this.id = id;
		this.passward = passward;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
}
