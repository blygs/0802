import java.util.Scanner;

// 최소 공배수
// 최대 공약수

public class WarmmingUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최소 공배수와 최대 공약수를 진행할 두 수 입력\n");
		System.out.print("첫번째 수 :");
		int first_num = sc.nextInt();
		System.out.print("두번째 수 : ");
		int second_num = sc.nextInt();
		
		
		for(int i = 1; i <= first_num; i++) {
			if((second_num * i) % first_num == 0) {
				System.out.println("최소 공배수 : " + second_num * i);
				break;
			}
		}
		
		int max = 1;
		
		for(int i = 1; i <= first_num; i++) {
			if(first_num % i == 0 && second_num % i == 0) {
				max = i;
			}
		}
		System.out.println("최대 공약수 : " + max);
		
		
	}
}
