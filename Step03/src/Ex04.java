import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		// BufferedReader
		// Scanner�� ���� ���
		// �ֿܼ��� �Է� ���� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// BufferedWriter
		// System.out.println �����ϸ� ��
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// BufferedReaer�� �� ������ �״�� �о���� ������ StringTokenizer�� ��� �Է¹޾ƾ��Ѵ�!(�Ǵ� split�̿�)
		StringTokenizer st;
		
		// String�� return���̹Ƿ� �ʿ�� �� ��ȯ �ؾ���
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < testCase ; i++) {
			
			// �� ��° �Ű������� ������ 
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
			
		}
		
		br.close();
		
		// ���� �ִ� ������ ��� ���
		bw.flush();
		bw.close();
		
		
		
		
	}
}
