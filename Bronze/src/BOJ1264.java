import java.util.Scanner;

// ������ ����
// �˰��� : ����, ���ڿ�
public class BOJ1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals("#")) break;
				
			char[] chArr = str.toLowerCase().toCharArray();

			int cnt  = 0;
			for(char x : chArr) {
				if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
	}
}
