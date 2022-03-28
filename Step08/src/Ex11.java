import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 터렛
// 풀이 참고함
public class Ex11 {
	
	public static int get_case(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int d = (int) (Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
		
		if(r1==r2 && x1==x2 && y1==y2) {
			return -1; // 무한대
		}else if(d > Math.pow(r1+r2, 2)) {
			return 0;
		}else if(d < Math.pow(r1-r2, 2)) {
			return 0;
		}else if(d == Math.pow(r1+r2, 2)) {
			return 1; // 외접
		}else if(d == Math.pow(r1-r2, 2)) {
			return 1; // 내접
		}else {
			return 2;
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			arr[i] = get_case(x1,y1,r1,x2,y2,r2);
		}
		
		for(int i=0; i<testCase; i++) {
			System.out.println(arr[i]);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
