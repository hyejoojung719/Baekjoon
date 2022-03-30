import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) ->{
			if(o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(arr[i][0] +  " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
