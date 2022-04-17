import java.util.Scanner;

// BOJ2446 
// 별 찍기9
// 알고리즘 : 구현
public class BOJ2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i=num; i>0; i--) {

			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}

			for(int j=2*i-1; j>0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

		for(int i=2; i<=num; i++) {

			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}

			for(int j=2*i-1; j>0; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
