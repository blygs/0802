
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Starting Program");
		int st = 1, la = 100;
		int result;
		result = calcSum(st, la);

		System.out.println("sum = " + result);

		st = 30;
		la = 50;
		result = calcSum(st, la);

		System.out.println("sum = " + result);

		System.out.println("End Program");
	}

	static int calcSum(int st, int la) { // Call by Value
		System.out.println("Starting Method");
		int sum = 0;
		for (int i = st; i <= la; i++) {
			sum += i;
		}
		System.out.println("End Method");

		return sum;
	}
}
