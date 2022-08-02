
public class VariableArgumentDemo {
	public static void main(String[] args) {
		int a = 5, b = 9;
		myMethod(a, b);		// Argument  --> 넘어가는 변수
		
		myMethod2( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	static void myMethod(int c, int d) {		//Parameter	--> 받는 변수
		
	}
	
	static void myMethod2(int...c) {			// Variable Argument --> 가변적 변수
		for(int i : c) {
			System.out.println(i);
		}
	}
}
