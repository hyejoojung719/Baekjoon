import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// N : ��ü ����� ��
		// x : �� ����� ������
		// y : �� ����� Ű
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken()); // ������
			arr[i][1] = Integer.parseInt(st.nextToken()); // Ű
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			for(int j=0; j<N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] && i!=j) {
					rank++;
				}
			}
			bw.write(rank + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
