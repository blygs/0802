
public class Output {
	static void output(Student std) {
		System.out.println("***** 메가존 클라우드 채용연계 개발자 교육 과정 *****\n");
		System.out.printf("\t학번\t\t이름\t\t국어\t 영어\t 수학\t\t총점\t\t평균\t\t평점\n");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t\t%s\t %d\t %d\t %d\t\t%d\t\t%.2f\t%c\n", std.st_number, std.name, std.kor, std.eng, std.mat, std.tot, std.avg, std.grade);
	}
}
