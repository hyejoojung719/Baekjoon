import java.util.Scanner;

// 개표
// 알고리즘 : 문자열
public class BOJ10102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		
		int a=0, b=0;
		for(int i=0; i<num; i++) {
			if(str.charAt(i)=='A') {
				a++;
			}else {
				b++;
			}
		}
		
		if(a>b) System.out.println("A");
		else if(a<b) System.out.println("B");
		else System.out.println("Tie");
	}
}
