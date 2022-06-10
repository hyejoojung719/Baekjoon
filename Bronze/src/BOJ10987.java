import java.util.Scanner;

// 모음의 개수
// 알고리즘 : 구현, 문자열
public class BOJ10987 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-97]++;
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(i==0 || i==4 || i==8 || i==14 || i==20) {
				cnt += arr[i];
			}
		}
		
		System.out.println(cnt);
		
		
	}
}
