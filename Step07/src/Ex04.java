import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		
		String[] strArr = new String[testCase];
		int[] cntArr = new int[testCase];
		for(int i=0; i<testCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cntArr[i] = Integer.parseInt(st.nextToken());
			strArr[i] = st.nextToken();
		}
		
		for(int i=0; i<testCase; i++) {
			for(int j=0; j<strArr[i].length();j++) {
				for(int k=0; k < cntArr[i];k++) {
					System.out.print(strArr[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}
