import java.util.Scanner;

// 등장하지 않는 문자의 합
// 알고리즘 : 구현, 문자열
public class BOJ3059 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int sum = 0;
		for(int i=65; i<=90; i++) {
			sum += i;
		}
		
		for(int i=0; i<tc; i++) {
			String str = sc.next();
			
			boolean[] check = new boolean[26];
			
			for(int j=0; j<str.length(); j++) {
				if(!check[str.charAt(j)-'A']) check[str.charAt(j)-'A'] = true;
			}
			
			int ans = 0;
			int cnt = 0;
			
			for(int j=0; j<check.length; j++) {
				if(!check[j]) {
					ans+=j;
					cnt++;
				}
			}
			
			ans+=cnt*65;
			System.out.println(ans);
		}
	}
}
