import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 네 수
// 알고리즘 : 구현
public class BOJ10824 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		String d = st.nextToken();
		
		long result1 = Long.parseLong(a+b);
		long result2 = Long.parseLong(c+d);
		
		System.out.println(result1+result2);
	}
}
