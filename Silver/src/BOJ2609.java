import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
// 알고리즘 : 수학, 정수론, 유클리드 호제법
public class BOJ2609 {
	
	// 최대공약수 구하기 -> 유클리드 호제법 이용
	public static int gcf(int max, int min) {
		int r = max % min;
		
		if(r==0) {
			return min; // 나머지가 0이면 작은숫자가 최대공약수
		}else {
			return gcf(min, r); //나머지가 0이상이면 재귀로 호출
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// 최대공약수
		int result1 = gcf(Math.max(a, b), Math.min(a, b));
		
		// 최소공배수 구하기
		int result2 = result1 * (a/result1) * (b/result1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		br.close();
	}
}
