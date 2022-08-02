
public class MethodDemo6 {
	public static void main(String[] args) {
		int[] arr = new int[] {5, 9};
		System.out.println("Before swap : a = " + arr[0] + ", b = " + arr[1]);
		swap(arr);
		System.out.println("After swap : a = " + arr[0] + ", b = " + arr[1]);
		
	}
	
	static void swap(int[] arr) {
		System.out.println("In Method, before swap : a = " + arr[0] + ", b = " + arr[1] );
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("In Method, after swap : a = " + arr[0] + ", b = " + arr[1] );
	}
}

