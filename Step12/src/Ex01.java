import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// BOJ 15649 N�� M(1)
// ��Ƴ�.. 
public class Ex01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 1���� N���� �ڿ���
		int M = Integer.parseInt(st.nextToken()); // �ߺ� ���� M���� �� ����
		
		int[] number = new int[N];
		
		// number�迭�� 1���� N���� �ڿ��� ����
		for(int i=0; i<N; i++) {
			number[i] = i+1;
		}
		
		// "�ߺ� ����" M���� ���� ����...
		// 4P2
		
		int cases=1;
		for(int i=N; i>0; i--) {
			cases *= N;
		}
		
		
		
		
		
		
		
	}
}
