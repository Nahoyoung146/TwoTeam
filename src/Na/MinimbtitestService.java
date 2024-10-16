package Na;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimbtitestService {
	private MinimbtitestDTO dto;

	public MinimbtitestService() {
		dto = new MinimbtitestDTO("홍길동", 0, 0, 0, 0, 0, 0, 0, 0);
	}

	public void Minimbtitest() {
		char[] answer1 = new char[4];
		char[] answer2 = { 'y', 'n' };
		char[] result = { 'E', 'I', 'N', 'S', 'F', 'T', 'J', 'P' };
		char first, second, third, fourth;
		Scanner sc = new Scanner(System.in);
		ArrayList<MinimbtitestDTO> mbti = new ArrayList<MinimbtitestDTO>();
		while (true) {
			System.out.println("1. 이름등록\n2. 검사실시\n3. 결과확인\n4. 메인메뉴로 나가기");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				if (mbti.size() == 0) {
					System.out.print("이름 입력 : ");
					dto.setName(sc.next());
					mbti.add(new MinimbtitestDTO(dto.getName(), 0, 0, 0, 0, 0, 0, 0, 0));
					System.out.println(dto.getName() + "님 환영합니다.");
				}

				else
					System.out.println("이미 등록되었습니다.");
				break;
			case 2:
				if (mbti.size() == 0)
					System.out.println("이름등록 먼저해주세요!!!!");
				else {
					if (answer1[0] == 0) {
						System.out.println(
								"아주 간단한 mbti 검사입니다. 진지하게 받아들이지 마시고 재미로 하세요!!\n총 4개의 질문이 나오고 각각의 질문에 대해서 y,n으로 대답해 주시면 됩니다.");
						System.out.println("1. 나는 사람들이 많이 모여있는 곳을 가는 게 좋다");
						answer1[0] = sc.next().charAt(0);
						System.out.println("2. 나는 현실적이다.");
						answer1[1] = sc.next().charAt(0);
						System.out.println("3. 나는 감성적이다.");
						answer1[2] = sc.next().charAt(0);
						System.out.println("4. 나는 계획적이다.");
						answer1[3] = sc.next().charAt(0);
						System.out.println("검사 완료");
					}

					else
						System.out.println("이미 검사를 완료했습니다.");
				}
				break;
			case 3:
				if (mbti.size() == 0)
					System.out.println("이름등록 먼저해주세요!!!!");
				else {
					System.out.print("개인정보를 위해 결과 확인 후 기록이 바로 지워집니다. 양해 부탁드립니다.");
					if (answer1[0] == answer2[0])
						mbti.get(0).setE(5);
					else if (answer1[0] == answer2[1])
						mbti.get(0).setI(5);

					if (answer1[1] == answer2[0])
						mbti.get(0).setS(5);
					else if (answer1[1] == answer2[1])
						mbti.get(0).setN(5);

					if (answer1[2] == answer2[0])
						mbti.get(0).setF(5);
					else if (answer1[2] == answer2[1])
						mbti.get(0).setT(5);

					if (answer1[3] == answer2[0])
						mbti.get(0).setJ(5);
					else if (answer1[3] == answer2[1])
						mbti.get(0).setP(5);

					if (mbti.get(0).getE() > mbti.get(0).getI())
						first = result[0];
					else
						first = result[1];

					if (mbti.get(0).getN() > mbti.get(0).getS())
						second = result[2];
					else
						second = result[3];

					if (mbti.get(0).getF() > mbti.get(0).getT())
						third = result[4];
					else
						third = result[5];

					if (mbti.get(0).getJ() > mbti.get(0).getP())
						fourth = result[6];
					else
						fourth = result[7];
					System.out.println(mbti.get(0).getName() + "님의 결과 : " + first + second + third + fourth);
					mbti.clear();
				}
				break;
			case 4:
				System.out.println("메인메뉴로 나갑니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
}
