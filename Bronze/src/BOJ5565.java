import java.util.Scanner;

// ������
// �˰��� : ����, ����, ��Ģ����
public class BOJ5565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			price -= sc.nextInt();
		}
		
		System.out.println(price);
	}
}
