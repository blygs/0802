import java.util.Scanner;

public class Input {
	static void input(Student std) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요. : ");
		std.name = sc.nextLine();

		System.out.print("학번을 입력하세요 : ");
		std.st_number = sc.nextLine();

		System.out.print("국어 점수를 입력하세요 : ");
		std.kor = sc.nextInt();

		System.out.print("영어 점수를 입력하세요 : ");
		std.eng = sc.nextInt();

		System.out.print("수학 점수를 입력하세요 : ");
		std.mat = sc.nextInt();
		sc.nextLine();
	}
}
