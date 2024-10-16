package bang;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.Scanner;


public class BangService {
	Scanner input = new Scanner(System.in);
	BangDTO dto = new BangDTO();
	int num = 0;
	String name;
	private ArrayList<BangDTO> member;
	public BangService() {
		member = new ArrayList<BangDTO>();
	}
public void in() {
	System.out.println("이름 입력");
	name = input.next();
	System.out.println("전화번호 입력");
	num = input.nextInt();
	
	dto.setName(name);
	dto.setNum(num);
	
	member.add(dto);
}
public void see() {
	for(int i = 0;i< member.size(); i++) {
		BangDTO d = member.get(i);
		System.out.print(dto.getName() + "\t");
		System.out.println(dto.getNum());
	}
}
public void display() {
	boolean bool = true;
	while (bool) {
		System.out.println("1.전화번호 등록");
		System.out.println("2.모든 전화번호 보기");
		System.out.println("3.종료");
		num = input.nextInt();
		switch (num) {
		case 1:
			in();
			break;
		case 2:
			see();
			break;
		case 3:
			bool = false;
			break;
		}
		
	}
}
}
