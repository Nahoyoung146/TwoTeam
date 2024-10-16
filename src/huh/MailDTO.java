package huh;

public class MailDTO {
	private String cont,addr;
	public MailDTO() {}
	public MailDTO(String cont, String addr) {
		this.cont=cont;
		this.addr=addr;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
