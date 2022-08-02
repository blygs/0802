
public class MethodDemo5 {
	public static void main(String[] args) {
		int a= 5, b = 9;
		System.out.println("Before swap : a = " + a + ", b = " + b);
		swap(a, b);
		System.out.println("After swap : a = " + a + ", b = " + b);
		
	}
	
	static void swap(int a, int b) {
		System.out.println("In Method, before swap : a = " + a + ", b = " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("In Method, after swap : a = " + a + ", b = " + b );
	}
}

