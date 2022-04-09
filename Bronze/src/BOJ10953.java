import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A+B-6
//알고리즘 : 수학, 문자열, 사칙연산, 파싱
public class BOJ10953 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		
		int[] result = new int[testCase];
		
		int a, b =0;
		for(int i=0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			result[i] = a+b;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
