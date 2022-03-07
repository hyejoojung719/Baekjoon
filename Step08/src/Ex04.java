import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		// 반복문 쓰면 무조건 시간초과 뜸....
		/*
		int i=1;
		while(true) {
			if( i-1+a >= v) {
				break;
			}else {
				i++;
			}
		}*/
		
		int day = (v-b)/(a-b);
		if((v-b)%(a-b)==0) {
			bw.write(day +"\n");
		}else {
			bw.write((day+1) +"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
