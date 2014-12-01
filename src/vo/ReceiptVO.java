package vo;


public class ReceiptVO {
	
	ReceiptState state = ReceiptState.EXAMING;
	ReceiptType type;
	public String getId(){
		return null;
	}
	public ReceiptState getState() {
		return state;
	}
	public void setState(ReceiptState state) {
		this.state = state;
	}
	public ReceiptType getType() {
		return type;
	}
	public void setType(ReceiptType type) {
		this.type = type;
	}
	
	

}
