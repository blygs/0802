
/*정답 : 1, 2, 3, 4, 1, 2, 3, 4, 1, 2

학생들 제출 답안
한지민 : 1, 2, 2, 4, 2, 2, 3, 4, 1, 2
박지민 : 1, 2, 3, 4, 1, 1, 1, 4, 1, 1
홍지민 : 1, 2, 3, 4, 1, 2, 3, 4, 1, 2
신지민 : 1, 3, 3, 3, 3, 3, 3, 3, 1, 2
김지민 : 1, 2, 3, 4, 1, 2, 3, 1, 1, 2

채점 결과
한지민 : o, o, x, o, x, o, o, o, o, o (80점)......*/

public class Practice {
	public static void main(String[] args) {
		String[] name = new String[] { "한지민", "박지민", "홍지민", "신지민", "김지민" };
		int[][] rep = new int[][] { 
			{ 1, 2, 2, 4, 2, 2, 3, 4, 1, 2 },
			{ 1, 2, 3, 4, 1, 1, 1, 4, 1, 1 },
			{ 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 }, 
			{ 1, 3, 3, 3, 3, 3, 3, 3, 1, 2 }, 
			{ 1, 2, 3, 4, 1, 2, 3, 1, 1, 2 } };

		int[] corect = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		
		System.out.println("[정답]");
		for(int i = 0; i < corect.length; i++) {
			System.out.print(corect[i]+ "\t");
		}
		System.out.println();
		
		System.out.println("[학생들 제출 답안]");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " :\t");
			for(int j = 0; j < rep[i].length; j++) {
				System.out.print(rep[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("[채점 결과]");
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " :\t");
			double score = 100;
			for(int j = 0; j < corect.length; j++) {
				if(rep[i][j] == corect[j]) {
					System.out.print("o\t");
				}
				else {
					System.out.print("x\t");
					score -= ((double)100 / corect.length);
				}
			}
			System.out.println("( " + score + "점 )");
		}
	}
}
