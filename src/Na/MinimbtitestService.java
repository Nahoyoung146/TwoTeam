package Na;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimbtitestService {
	private MinimbtitestDTO dto;

	public MinimbtitestService() {
		dto = new MinimbtitestDTO("홍길동", 0, 0, 0, 0, 0, 0, 0, 0);
	}

	public void Minimbtitest() {
		Scanner sc = new Scanner(System.in);
		ArrayList<MinimbtitestDTO> mbti = new ArrayList<MinimbtitestDTO>();
		while (true) {
			System.out.println("1. 이름등록\n2. 검사실시\n3. 결과확인\n4. 정보삭제\n5. 메인메뉴로 나가기");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름 입력 : ");
				dto.setName(sc.next());
				mbti.add(new MinimbtitestDTO(dto.getName(), 0, 0, 0, 0, 0, 0, 0, 0));
				System.out.println(dto.getName() + "님 환영합니다.");
				break;
			case 2:
				System.out.println(
						"아주 간단한 mbti 검사입니다. 진지하게 받아들이지 마시고 재미로 하세요!!\n총 4개의 질문이 나오고 각각의 질문에 대해서 y,n으로 대답해 주시면 됩니다.");
				System.out.println("1. 나는 사람들이 많이 모여있는 곳을 가는 게 좋다");
				char ch1 = sc.next().charAt(0);
				System.out.println("2. 나는 현실적이다.");
				char ch2 = sc.next().charAt(0);
				System.out.println("3. 나는 감성적이다.");
				char ch3 = sc.next().charAt(0);
				System.out.println("4. 나는 계획적이다.");
				char ch4 = sc.next().charAt(0);
				break;
			case 3:
				if(ch1==y) {
					
				}
				break;
			case 4:
				break;
			case 5:
				System.out.println("메인메뉴로 나갑니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

			}
		}
	}
}
