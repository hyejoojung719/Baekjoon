import java.util.Scanner;

// �ֻ��� ����
// �˰��� : ����, ����, �ùķ��̼�, ��Ģ����
public class BOJ10103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a, b;
		a = b = 100;
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x>y) {
				b -= x;
			}else if(x<y) {
				a -= y;
			}else {
				continue;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
	}
}
