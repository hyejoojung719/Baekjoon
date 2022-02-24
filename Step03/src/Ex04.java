import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		// BufferedReader
		// Scanner와 같은 기능
		// 콘솔에서 입력 받을 때
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// BufferedWriter
		// System.out.println 생각하면 됨
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// BufferedReaer는 한 라인을 그대로 읽어오기 때문에 StringTokenizer로 끊어서 입력받아야한다!(또는 split이용)
		StringTokenizer st;
		
		// String이 return값이므로 필요시 형 변환 해야함
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < testCase ; i++) {
			
			// 두 번째 매개변수는 구분자 
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
			
		}
		
		br.close();
		
		// 남아 있는 데이터 모두 출력
		bw.flush();
		bw.close();
		
		
		
		
	}
}
