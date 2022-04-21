import java.util.Scanner;

// 별찍기12
// 알고리즘 : 구현
public class BOJ2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
