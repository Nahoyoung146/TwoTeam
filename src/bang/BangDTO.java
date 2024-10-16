package bang;

public class BangDTO {
	private String name;
	private int num;
	public BangDTO() {}
	public BangDTO(String name, int num) {
		this.name = name;
		this.num = num;
	}
	public String toString() {
		return "["+name+", "+num+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
