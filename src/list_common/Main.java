package list_common;

import java.util.InputMismatchException;
import java.util.Scanner;
import Na.MinimbtitestService;
import huh.MailService;
import sodam.ListServicesodam;

public class Main {
	public static void main(String[] args) {
		MinimbtitestService na = new MinimbtitestService();
		ListServicesodam s = new ListServicesodam();
		MailService h = new MailService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int menu = 0;
			System.out.println("[1] 이메일 작성");
			System.out.println("[2] ");
			System.out.println("[3] 출석부 관리 ");
			System.out.println("[4] ");
			System.out.println("[5] 미니 MBTI 검사 ");
			System.out.println("[6] ");
			System.out.print(">>> ");

			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력!!!");
				sc = new Scanner(System.in);
			} finally {
				switch (menu) {
				case 1: // 하은미
					h.dip();
					break;
				case 2: // 방준혁

					break;
				case 3: // 박소담
					s.disp();
					break;
				case 4: // 김영주

					break;
				case 5: // 나호영
					na.Minimbtitest();
					break;
				case 6:
					System.out.println("프로그램 종료");
					return;
				default: // 다른 값 입력
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}

	}
}