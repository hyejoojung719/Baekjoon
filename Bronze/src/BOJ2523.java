import java.util.Scanner;

// 별찍기 13
// 알고리즘 : 구현
public class BOJ2523 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=num-1; i>0; i-- ) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
