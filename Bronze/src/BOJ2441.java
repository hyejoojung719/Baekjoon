import java.util.Scanner;

// 별찍기 -4
// 알고리즘 : 구현
public class BOJ2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<n-i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
