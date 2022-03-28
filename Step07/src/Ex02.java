import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a1 = 1;
		int c = 1;
		
		
		while(true) {
			int sum = 0;
			for(int k=1; k<=(c-1); k++) {
				sum = sum + 6*k;
			}
			int an = a1 + sum;
			
			int presum = 0;
			for(int k=1; k<=(c-2); k++) {
				presum = presum + 6*k;
			}
			int prean = a1 + presum;
			
			
			if(n > presum && n <= an) {
				System.out.println(c);
				break;
			}else {
				c++;
			}
		}
	}
}
