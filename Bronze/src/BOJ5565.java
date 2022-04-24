import java.util.Scanner;

// 영수증
// 알고리즘 : 구현, 수학, 사칙연산
public class BOJ5565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			price -= sc.nextInt();
		}
		
		System.out.println(price);
	}
}
