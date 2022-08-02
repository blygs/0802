
public class ArrayDemo4 {
	public static void main(String[] args) {
		// java ArrayDemo4 "mango banana apple"
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("array[" + i + "] = " +args[i]);
		}
		
		if(args.length != 3) {
			System.err.println("Usage Error");
			System.exit(0);		// 0 : 정상 종료
		}
		else {
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[2]);
			
			switch(args[1]) {
			case "+" : System.out.println(a + b); break;
			case "-" : System.out.println(a - b); break;
			case "/" : System.out.println(a / b); break;
			case "*" : System.out.println(a * b); break;
			case "%" : System.out.println(a % b); break;
			default :
				System.err.println("Usage Error");
				System.exit(0);		// 0 : 정상 종료
			}
		}
	}
}
