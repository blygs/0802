import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
//		String[] array = {"한지민", "헨리", "Hello" };
//		for(int i =0; i < 5; i++) {				// Error
//			System.out.println(array[i]);
//		}
		
//		int[] array = {1, 2};
////		array[2] = 3; // Error
//		
//		array = new int[3];		// 배열은 resizing이 안되기 때문에 새로 주소를 할당한다.
//		array[2] = 3;
//		System.out.println(Arrays.toString(array));
		
		int[] original = {1, 2, 3, 4, 5};
		int[] target = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		System.arraycopy(original, 2, target, 0, 3);		// 값 복사, 단 각 배열의 범위를 벗어나면 오류가 난다.
		
		System.out.println(Arrays.toString(target));
		
		original[2] = 100;
		
		System.out.println(Arrays.toString(target));
		
		
	}
}
