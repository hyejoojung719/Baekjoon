import java.util.Scanner;

// 대소문자 바꾸기
// 알고리즘 : 문자열, 구현
public class BOJ2744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] strToCh = str.toCharArray();
		
		for(int i=0; i<strToCh.length; i++) {
			if(Character.isLowerCase(strToCh[i])) strToCh[i] = Character.toUpperCase(strToCh[i]);
			else strToCh[i] = Character.toLowerCase(strToCh[i]);
		}
		
		System.out.println(String.valueOf(strToCh));
	}
}
