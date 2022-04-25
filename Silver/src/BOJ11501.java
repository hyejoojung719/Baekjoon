import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주식
// 알고리즘 : 그리디 알고리즘
public class BOJ11501 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
			int[] arr = new int[N];
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int max=0;
			long sum=0;
			for(int j=N-1; j>=0; j--) {
				if(max < arr[j]) {
					max = arr[j];
				}else {
					sum += (max-arr[j]);
				}
			}
			
			System.out.println(sum);
		}
	}
}
