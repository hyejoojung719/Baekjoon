import java.util.Scanner;

// 계산기 프로그램
// 알고리즘 : 수학, 구현, 사칙연산
public class BOJ5613 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = Integer.parseInt(sc.nextLine());
		int result = num1;
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("=")) break;
			
			int num2 = Integer.parseInt(sc.nextLine());
			
			if(str.equals("-")) result -= num2;
			else if(str.equals("+")) result += num2;
			else if(str.equals("*")) result *= num2;
			else result /= num2;
		}
		
		System.out.println(result);
		
		
	}
}
