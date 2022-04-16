import java.util.Scanner;

// 별찍기 - 7
// 알고리즘 : 구현
public class BOJ2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-(i+1); j++) {
				System.out.print(" ");
			}
			for(int j=2*i+1; j>0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num-1; i>0; i--) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int j=2*i-1; j>0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
