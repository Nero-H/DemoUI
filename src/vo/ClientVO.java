package vo;

import java.io.Serializable;


public class ClientVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String num;
	private ClientClassification classification;	//客户分类
	private ClientLevel level;		//客户等级
	private String name;
	private String telephone;
	private String address;
	private String postCode;	//邮编
	private String email;	//邮件
	private double quota;	//应收额度
	private double receivable = 0;	//应收
	private double payable = 0;		//应付
	private String defaultSalesman;		//默认业务员
	
	
	public String getNum() {
		return num;
	}
	
	public ClientClassification getClassification() {
		return classification;
	}
	
	public ClientLevel getLevel() {
		return level;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getQuota() {
		return quota;
	}
	
	public double getReceivable() {
		return receivable;
	}
	
	public double getPayable() {
		return payable;
	}
	
	public String getDefaultSalesman() {
		return defaultSalesman;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setClassification(ClientClassification classification) {
		this.classification = classification;
	}

	public void setLevel(ClientLevel level) {
		this.level = level;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setQuota(double quota) {
		this.quota = quota;
	}

	public void setReceivable(double receivable) {
		this.receivable = receivable;
	}

	public void setPayable(double payable) {
		this.payable = payable;
	}

	public void setDefaultSalesman(String defaultSalesman) {
		this.defaultSalesman = defaultSalesman;
	}
	
}
