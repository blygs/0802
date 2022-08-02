public class StdMgmt1 {
	public static void main(String[] args) {
		System.out.println("*** 성정 관리 프로그램 시작 ***\n");

		Student jimin = new Student();

		Input.input(jimin);
		Calc.calc(jimin);
		Output.output(jimin);

		System.out.println("\n*** 성정 관리 프로그램 종료 ***");
	}

}
