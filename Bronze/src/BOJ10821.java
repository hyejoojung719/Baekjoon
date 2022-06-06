import java.util.Scanner;

// 정수의 개수
// 알고리즘 : 문자열
public class BOJ10821 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] num = s.split(",");
		
		System.out.println(num.length);
	}
}
