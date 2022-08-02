
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Starting Program");
		calcSum(1, 100);
		calcSum(30, 50);
		System.out.println("End Program");
	}
	static void calcSum(int st, int la) {		// Call by Value
		System.out.println("Starting Method");
		int sum = 0;
		for (int i = st; i <= la; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("End Method");
	}
}
