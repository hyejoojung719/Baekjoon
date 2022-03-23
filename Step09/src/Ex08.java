import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 네번째 점
public class Ex08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int x=0;
		int y=0;
		if(xArr[0] == xArr[1]) {
			x = xArr[2];
		}else if(xArr[0] == xArr[2]) {
			x = xArr[1];
		}else {
			x = xArr[0];
		}
		
		if(yArr[0] == yArr[1]) {
			y = yArr[2];
		}else if(yArr[0] == yArr[2]) {
			y = yArr[1];
		}else {
			y = yArr[0];
		}
		
		System.out.println(x + " " + y);
		
		

		br.close();
		bw.flush();
		bw.close();
		
	}
}
