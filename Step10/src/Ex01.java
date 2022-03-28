import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// ���Ʈ���� �˰��� 
// ������ ÷���� ������ ����ϸ� ���� ã�� �˰���
// ������ ���ڰ� Ŀ�� ���� �ð� ���⵵�� Ŀ����...
// ���Ʈ���� ���� (�ڷᱸ���� ���� 2������ ����)
// 1. ���� ���� - ����Ž��
// 2. �������� - BFS, DFS
public class Ex01 {
	
	
	public static int sum(int[] arr, int N, int M) {
		int result = 0;
		
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum == M) {
						return sum;
					}
					
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		// ����
		// ī���� ���� M�� ���� �ʴ� �ѵ� ������ 
		// N���� ī�� �߿� 3���� ī�带 ���
		// M�� ���� ������ M�� �ִ��� ������ �����. 
		
		// ī���� ���� M�� �� N�� �Է¹���.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		System.out.println(sum(arr, N, M));
		
		
	}
}
