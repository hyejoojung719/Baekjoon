import java.util.Scanner;

// 사파리월드
// 알고리즘 : 구현, 수학, 사칙연산
public class BOJ2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextInt();
		long num2 = sc.nextInt();
		
		System.out.println(Math.abs(num1-num2));
	}

}
