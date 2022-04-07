import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10何力 
// 舅绊府硫 : 备泅
public class BOJ10797 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		int date = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(date == Integer.parseInt(st.nextToken())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
