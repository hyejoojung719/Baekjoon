import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10817 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// 두 번째로 큰 정수 출력
		if((a>=b && a<=c) || (a>=c && a<=b)) {
			System.out.println(a);
		}else if((b>=c && b<=a) || (b>=a && b<=c)) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
