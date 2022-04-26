import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파티가 끝나고 난뒤
// 알고리즘 : 구현, 수학, 사칙연산
public class BOJ2845 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int cnt = Integer.parseInt(st.nextToken());
		int area = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int target = 0;
		for(int i=0; i<5; i++) {
			target = Integer.parseInt(st2.nextToken());
			System.out.print((target-(cnt*area))+" ");
		}
	}
}
