import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// �� ����2
// ���⼭�� ���� �Լ� ���
// �ð��ʰ� �� �߰� �ϴ� ��??
public class Ex02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		int[] arr = new int[testCase];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}
