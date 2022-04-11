import java.util.Scanner;

// 별찍기 - 6
// 알고리즘 : 구현
public class BOJ2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			
			for(int k=0; k<num-i ;k++) {
				System.out.print(" ");
			}
			
			for(int j=i*2-1; j>0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
