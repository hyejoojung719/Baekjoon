import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex05 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		
		int[][]  arr = new int[testCase][3]; 
		
		for(int i=0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			arr[i][0] = H;
			arr[i][1] = W;
			arr[i][2] = N;
		}
		
		for(int i=0; i<testCase; i++) {
			int HH;
			int WW;
			if(arr[i][2]%arr[i][0] != 0) {
				HH = arr[i][2]%arr[i][0];
				WW = arr[i][2]/arr[i][0]+1;
			}else {
				HH = arr[i][0];
				WW = arr[i][2]/arr[i][0];
			}
			
			if(WW < 10) {
				bw.write(HH+"0"+WW+ "\n");
			}else {
				bw.write(HH+""+WW+ "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	
		
	}
}
