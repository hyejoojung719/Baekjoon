import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int tmp=n;
		for(int i=2; i<=n; i++ ) {
			if(tmp%i == 0) {
				while(true) {
					System.out.println(i);
					tmp = tmp/i;
					if(tmp%i != 0) {
						break;
					}
				}
			}
		}
	}
}
