import java.util.Scanner;

// 입력, 출력, 계산 -> 메소드

public class StdMgmt {
	public static void main(String[] args) {
		System.out.println("*** 성정 관리 프로그램 시작 ***\n");

		Student jimin = new Student();

		input(jimin);
		calc(jimin);
		output(jimin);

		System.out.println("\n*** 성정 관리 프로그램 종료 ***");
	}

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

	static void calc(Student std) {
		std.tot = std.kor + std.eng + std.mat;
		std.avg = std.tot / 3.0;

		std.grade = (std.avg >= 90) ? 'A'
				: ((std.avg >=80) ? 'B' : ((std.avg >= 70) ? 'C' : ((std.avg >= 60) ? 'D' : 'F')));
	}

	static void output(Student std) {
		System.out.println("***** 메가존 클라우드 채용연계 개발자 교육 과정 *****\n");
		System.out.printf("\t학번\t\t이름\t\t국어\t 영어\t 수학\t\t총점\t\t평균\t\t평점\n");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t\t%s\t %d\t %d\t %d\t\t%d\t\t%.2f\t%c\n", std.st_number, std.name, std.kor, std.eng, std.mat, std.tot, std.avg, std.grade);
	}
}
