import java.util.Scanner;

// 0 = not cute / 1 = cute
// 알고리즘 : 수학, 구현, 사칙연산
public class BOJ10886 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int cute = 0;
		int notCute = 0; 
		for(int i=0; i<num; i++) {
			int result = sc.nextInt();
			
			if(result == 1) {
				cute++;
			}else {
				notCute++;
			}
		}
		
		if(cute>notCute) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
	}
}
