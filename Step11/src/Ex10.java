import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//BOJ 18870 좌표 압축

//'서로 다른' 이라는 조건 때문에 어려웠던 문제..
public class Ex10 {
	public static void main(String[] args) throws Exception {
		
		// 1. 중복 제거한 배열 새로 생성
		// 2. 거기서 좌표 압축 한 숫자 count
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
