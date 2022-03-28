import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		int big = 0;
		int small = 0;
		
		// 3kg 5kg
		
		if(kg%5%3 != 0) {
			
			for(int i=kg/5; i>=0 ;i--) {
				int a = kg-5*i;
				
				if(a%3 != 0) {
					continue;
				}else {
					big = i;
					small = a/3;
					break;
				}
			}
			
			if(big==0 && small==0) {
				System.out.println(-1);
			}else {
				System.out.println(big+small);
			}
		}else {
			big = kg/5;
			small = kg%5/3;
			System.out.println(big+small);
		}
		
		
	}
}
