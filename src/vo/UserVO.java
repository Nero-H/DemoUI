package vo;

public class UserVO {
	String name;
	String id;
	String passward;
	UserIdentity identity;

	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(UserIdentity identity) {
		this.identity = identity;
	}

	public UserVO(String name, String id, String passward,UserIdentity identity) {
		this.name = name;
		this.id = id;
		this.passward = passward;
		this.identity=identity;
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
