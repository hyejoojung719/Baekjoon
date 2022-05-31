import java.util.Scanner;

// 문자가 몇갤까
// 알고리즘 : 문자열, 구현
public class BOJ7600 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("#")) break;
			
			
			char[] chArr = str.toLowerCase().toCharArray();
			
			int[] cnt = new int[26]; // +97
			
			for(int i=0; i<cnt.length; i++) {
				for(int j=0; j<chArr.length; j++) {
					if((i+97)==chArr[j]) {
						cnt[i]++;
						break;
					}
				}
			}
			
			int result = 0;
			for(int n : cnt) {
				if(n == 1) result++;
			}
			
			System.out.println(result);
		}
		
		
		
		
	}
}
