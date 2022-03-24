import java.util.Scanner;

// 피보나치 재귀함수로 풀기
public class Ex02 {
	
	public static int fibo(int num) {
		
		if(num==0) {
			return 0;
		}else if (num==1) {
			return 1;
		}else {
			return fibo(num-1) + fibo(num-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(fibo(num));
	}
}
