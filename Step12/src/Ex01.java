import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// BOJ 15649 N과 M(1)
// 어렵네.. 
public class Ex01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 1부터 N까지 자연수
		int M = Integer.parseInt(st.nextToken()); // 중복 없이 M개를 고른 수열
		
		int[] number = new int[N];
		
		// number배열에 1부터 N까지 자연수 담음
		for(int i=0; i<N; i++) {
			number[i] = i+1;
		}
		
		// "중복 없이" M개를 고르는 수열...
		// 4P2
		
		int cases=1;
		for(int i=N; i>0; i--) {
			cases *= N;
		}
		
		
		
		
		
		
		
	}
}
