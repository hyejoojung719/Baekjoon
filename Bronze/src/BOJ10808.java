import java.util.Scanner;

// ���ĺ� ����
// �˰��� : ����, ���ڿ�
public class BOJ10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int[] cnt = new int[26];
		
		for(int i=0; i<cnt.length; i++) {
			for(int j=0; j<str.length(); j++) {
				if((int)str.charAt(j) == (i+97)) {
					cnt[i]++;
				}
			}
			
			System.out.print(cnt[i] + " ");
		}
	}
}
