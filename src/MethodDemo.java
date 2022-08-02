
public class MethodDemo {
	public static void main(String[] args) {
		calcSum();
	}

	static void calcSum() {		// Call by Name
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
