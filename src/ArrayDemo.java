import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {4, 7, 2, 9, 4, 2, 1, 5, 8, 6, 7, 45, 33, 10 ,11, 34};
		
		System.out.println("befor sort");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After Asc sort");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After Desc sort");
		
		int[] desc_arr = new int[arr.length];
		for(int i = 0; i < desc_arr.length; i++) {
			desc_arr[i] = arr[arr.length - i - 1];
		}
		System.out.println(Arrays.toString(desc_arr));
	}
}
