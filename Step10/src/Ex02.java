import java.util.Scanner;

// ������
// ���Ʈ���� �˰���
public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// N = 216���� ���������� M + M�� �� �ڸ�����
		
		for(int i=1; i<=N; i++) {
			int sum = i;
			int tmp = i;
			while(tmp != 0) {
				sum += tmp%10;
				tmp = tmp/10;
			}
			
			if(sum == N) {
				System.out.println(i);
				break;
			}
			
			if(i == N) {
				System.out.println(0);
			}
		}
	}
}
