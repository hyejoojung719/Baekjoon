import java.util.Scanner;

// �� ���� ���� ����ϱ�
// �˰��� : ����, ���ڿ�
public class BOJ11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int flag = 0;
		for(int i=0; i<str.length()/10+1; i++) {
			
			if(i!=str.length()/10) {
				for(int j=0; j<10; j++) {
					System.out.print(str.charAt(j+flag));
				}
			}else {
				for(int j=0; j<str.length()%10; j++) {
					System.out.print(str.charAt(j+flag));
				}
			}
			
			System.out.println();
			flag+=10;
		}
		
	}
}
