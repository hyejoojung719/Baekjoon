import java.util.Scanner;

// BOJ5543 ��ٳ���
// �˰��� : ����, ��Ģ����
public class BOJ5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int m = sc.nextInt();
		int h = sc.nextInt();
		int burger = Math.min(s, m);
		burger = Math.min(burger, h);
		
		int cola = sc.nextInt();
		int cidar = sc.nextInt();
		int juice = Math.min(cola, cidar);
		
		System.out.println(burger+juice-50);
	}
}
