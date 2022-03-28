import java.util.Arrays;
import java.util.Scanner;

// ����������� �����
public class Ex03 {
	
	static char arr[][];
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		arr = new char[N][N];
		
		for(int i=0; i<arr.length;i++) {
			Arrays.fill(arr[i], ' ');	// �迭�� ��� ���� ' '(����)���� �ʱ�ȭ -> �̰� ���ϴϱ� Ʋ��
		}
		
		star(0,0,N); // ù ��°, �ι��� �Ű������� ������,,,
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// ����� �޼ҵ�
	public static void star(int a, int b, int N) {
		
		if(N==1) {
			arr[a][b] = '*';
			return;
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1&&j==1) continue;
				
				star(a+(N/3)*i, b+(N/3)*j, N/3); // ������ �ű�� ȣ��
			}
		}
	}
	
	
	
	
	
}
