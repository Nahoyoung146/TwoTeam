package sodam;

import java.util.Scanner;

public class ListServicesodam {
	
	public void disp() {

	Scanner input = new Scanner(System.in);
	int num=0, num1=0;
	String name1=null;
	
	
	while(true) {
	System.out.println("1. 학생 등록");
	System.out.println("2. 출석부 보기");
	System.out.println("3. 초기 메뉴로 돌아가기");
	System.out.print(">>>>> ");
	num = input.nextInt();
	
	switch(num) {
		case 1:
			System.out.println("\n"+"학생 등록 메뉴입니다.");
			System.out.print("출석번호 등록 >> ");
			num1 = input.nextInt();
			System.out.print("학생 이름 등록 >> ");
			name1 = input.next();
			System.out.println("학생 등록이 완료되었습니다."+"\n");
			break;
		case 2:
			System.out.println("\n"+"출석부 보기 메뉴입니다.");
			if(name1==null) {
				System.out.println("등록된 학생이 없습니다."+"\n");break;
			}else {
				System.out.println("출석번호"+"\t"+"이름");
				System.out.println(num1+"\t"+name1+"\n");
			}
			
			break;
		case 3:
			System.out.println("\n"+"초기 메뉴로 돌아갑니다."+"\n");
			return;
	}
	}
}
}
