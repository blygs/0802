
public class ArrayDemo1 {
	public static void main(String[] args) {
		//  << Rectangular Array >>
		// 1st way
//		int[][] array = null;		// 선언 declaration
//		array = new int[2][3];		// 생성
//		
//		array[0][0] = (int)(Math.random()*10 + 1);		// 할당,  Assignment
//		array[0][1] = (int)(Math.random()*10 + 1);
//		array[0][2] = (int)(Math.random()*10 + 1);
//		array[1][0] = (int)(Math.random()*10 + 1);
//		array[1][1] = (int)(Math.random()*10 + 1);
//		array[1][2] = (int)(Math.random()*10 + 1);
		
		// 2nd way
//		int[][] array;
//		array = new int[][] {
//			{3, 4, 5, 6 },
//			{7, 8, 9, 10},
//			{1, 2, 3, 4}
//		};
		
		// 3rd way
//		int[][] array = {
//				{3, 4, 5, 6 },
//				{7, 8, 9, 10},
//				{1, 2, 3, 4}
//			};
		
		
		// << Ragged ( Jagged) Array >>
		// 1st way
//		int[][] array;		// declaration
//		array = new int [3][];	// creation
//		
//		array[0] = new int[3];
//		array[1] = new int[2];
//		array[2] = new int[1];		// 각 행의 열의 갯수가 다를 수 있다.
//		
//		array[0][0] = (int)(Math.random()*10 + 1);
//		array[0][1] = (int)(Math.random()*10 + 1);
//		array[0][2] = (int)(Math.random()*10 + 1);
//		array[1][0] = (int)(Math.random()*10 + 1);
//		array[1][1] = (int)(Math.random()*10 + 1);
//		array[2][0] = (int)(Math.random()*10 + 1);
		
		// 2nd way
//		int[][] array;		// declaration
//		array = new int[3][];		// creation & Assignment
//		array[0] = new int[] {1, 2, 3, 4, 5};
//		array[1] = new int[] {6, 7};
//		array[2] = new int[] {8, 9, 10};
		
		
		// 3rd way
		int[][] array ={			// declaration & creation & Assignment
			{3, 4, 5, 6},
			{7, 8 },
			{9, 10, 1, 2}
		};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
