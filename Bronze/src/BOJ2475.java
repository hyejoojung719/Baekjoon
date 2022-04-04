import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ������ 
// �˰��� : ����, ����. ��Ģ����
public class BOJ2475 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[5];
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			sum += Math.pow(arr[i], 2);
		}
		
		System.out.println(sum%10);
		br.close();
	}
}
