import java.util.Scanner;

// 아!
// 알고리즘 : 문자열
public class BOJ4999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		
		if(str1.length()>=str2.length()) System.out.println("go");
		else System.out.println("no");
	}
}
