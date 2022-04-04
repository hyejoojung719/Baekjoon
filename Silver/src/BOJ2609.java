import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ִ������� �ּҰ����
// �˰��� : ����, ������, ��Ŭ���� ȣ����
public class BOJ2609 {
	
	// �ִ����� ���ϱ� -> ��Ŭ���� ȣ���� �̿�
	public static int gcf(int max, int min) {
		int r = max % min;
		
		if(r==0) {
			return min; // �������� 0�̸� �������ڰ� �ִ�����
		}else {
			return gcf(min, r); //�������� 0�̻��̸� ��ͷ� ȣ��
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		// �ִ�����
		int result1 = gcf(Math.max(a, b), Math.min(a, b));
		
		// �ּҰ���� ���ϱ�
		int result2 = result1 * (a/result1) * (b/result1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		br.close();
	}
}
