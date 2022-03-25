import java.util.Scanner;

// 분해합
// 브루트포스 알고리즘
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// N = 216보다 작은숫자중 M + M의 각 자릿수합
		
		for(int i=1; i<=N; i++) {
			int sum = i;
			int tmp = i;
			while(tmp != 0) {
				sum += tmp%10;
				tmp = tmp/10;
			}
			
			if(sum == N) {
				System.out.println(i);
				break;
			}
			
			if(i == N) {
				System.out.println(0);
			}
		}
	}
}
