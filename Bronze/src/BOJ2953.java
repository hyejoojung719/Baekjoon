import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나는 요리사다
// 알고리즘 : 수학, 구현, 사칙연산
public class BOJ2953 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		int max=0;
		int idx=0;
		for(int i=0; i<5; i++) {
			int sum=0;
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			if(max < sum) {
				max = sum;
				idx = i+1;
			}
		}
		
		System.out.println(idx + " " + max);
	}
}
