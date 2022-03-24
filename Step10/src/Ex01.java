import java.util.Scanner;

// 팩토리얼, 재귀
// 재귀함수 : 함수가 직간접적으로 자신을 호출하는 프로세스
public class Ex01 {
	
	// 팩토리얼 메소드
	public static int factorial(int num) {
		
		if(num<=1) 
			return  1;
		else
			return num*factorial(num-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
	}
}
