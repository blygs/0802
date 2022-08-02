import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print(" Row = ? : ");
//		int row = sc.nextInt();
//		
////		System.out.println(" Col; = ? : ");
//		int col;
//		
//		int[][] rows = new int[row][];
//		
//		for(int i = 0; i < row; i++) {
//			System.out.print(i + " 행의 col = ?");
////			System.out.println(" Col; = ? : ");
//			col = sc.nextInt();
//			
//			int[] cols = new int[row];
//			rows[i] = cols;
//		}
		
		int[][] array = {
				{1, 2, 3, 4, 5},
				{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
		};
		
		System.out.println("Before Swapping");
		System.out.println("<< 1층 >>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<< 2층 >>");
		System.out.println(Arrays.toString(array[1]));
		
		int[] temp_arr;
		temp_arr = array[0];
		array[0] = array[1];
		array[1] = temp_arr;
		
		System.out.println("After Swapping");
		System.out.println("<< 1층 >>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<< 2층 >>");
		System.out.println(Arrays.toString(array[1]));
		
	}
}
