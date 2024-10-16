package huh;

import java.util.ArrayList;
import java.util.Scanner;

public class MailService {
	Scanner input=new Scanner(System.in);
	private ArrayList<MailDTO> mail;
	public MailService() {
		mail=new ArrayList<MailDTO>();
	}
	public void sent() {
		MailDTO dto=new MailDTO();
		String cont,addr;
		System.out.println("등록 주소 입력");
		addr=input.next();
		System.out.println("등록 내용 입력");
		cont=input.next();

		dto.setAddr(addr);
		dto.setCont(cont);

		mail.add(dto);
		System.out.println("메일 보내기 완료");
	}
	public void mailView() {
		for(int i=0;i<mail.size();i++) {
			MailDTO d=mail.get(i);
			System.out.println("주소 : "+d.getAddr());
			System.out.println("주소 : "+d.getCont());
			System.out.println("-----------------------");
		}
	}
	public void dip() {
		int num;
		while(true) {
			System.out.println("1.보낸 메일 보기");
			System.out.println("2.메일 보내기");
			System.out.println("3.뒤로가기");
			num=input.nextInt();
			switch(num) {
			case 1:
				mailView();
				break;
			case 2:
				sent();
				break;
			case 3:return;
			}
		}
	}

}
