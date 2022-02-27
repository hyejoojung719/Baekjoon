import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	
	//1~99, 111 123 135 147 159 210
	public static int hansu(int n) {
		
		int count = 0; // 한수 개수
		
		for(int i=1;i<=n;i++) {
			if(i>=1 && i<100) {
				count++;
			}else if(i>=100 && i<1000) {
				int first = i%10;
				int second = (i/10)%10;
				int third = (i/100)%10;
				
				if(second-first == third-second) {
					count++;
				}
				
			}else {
				int first = i%10;
				int second = (i/10)%10;
				int third = (i/100)%10;
				int forth = (i/1000)%10;
				
				if((second-first == third-second) && (third-second == forth-third)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(hansu(n));
	}
	
}
