
public class MethodDemo3 {
	public static void main(String[] args) {
		
		Student st = mymethod();
		
		System.out.println("학생 이름 = " + st.name + ", 학생 나이 = " + st.age);
	}
//	static int[] mymethod() {
//		
//		
//		return new int[] {5, 9};
//	}
	
	static Student mymethod() {
		
		Student jimin = new Student();
		jimin.name = "한지민";
		jimin.age = 26;
		
		
		return jimin;
	}
}
