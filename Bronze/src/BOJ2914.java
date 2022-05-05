import java.util.Scanner;

// 저작권
// 알고리즘 : 구현, 수학, 사칙연산..
public class BOJ2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int whole = sc.nextInt();
		int avg = sc.nextInt();
		
		for(int i=whole*avg; i>=0; i--) {
			if(Math.ceil(i/(double)whole)!=avg) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
