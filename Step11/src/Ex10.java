import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//BOJ 18870 ��ǥ ����

//'���� �ٸ�' �̶�� ���� ������ ������� ����..
public class Ex10 {
	public static void main(String[] args) throws Exception {
		
		// 1. �ߺ� ������ �迭 ���� ����
		// 2. �ű⼭ ��ǥ ���� �� ���� count
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] temp = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		StringBuilder sb = new StringBuilder();
		
//		for(int i=0; i<cnt.length; i++) {
//			sb.append(cnt[i]).append(' ');
//		}
//		
		System.out.println(sb);
		
		br.close();
	}
}
