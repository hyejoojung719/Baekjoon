import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//BOJ 2108 ����� + ī���� ����
public class R_Ex04_02 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// �Է°��� ���� : -4000 ~ 4000;
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		int median = 10000; // �߾Ӱ� ����
		int mode = 10000; // �ֺ� ����
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value; // �հ�
			
			// ī���� �ϴ� �迭
			arr[value + 4000]++; // ������ -4000���� �����ϹǷ� ���� -4000�� �Է¹��� ��� �ε���0 �� ������
			// ���� 4000�� ������
			
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
			
		}
		
		int count = 0; // �߾Ӱ� �� ���� ��
		int mode_max = 0; // �ֺ��� �ִ밪
		boolean flag = false; // ������ ������ �ֺ��� 1���� �������� ��� true, �ƴҰ�� false
		
		for(int i=min+4000; i <= max+4000; i++) {
			
			if(arr[i] > 0) {
				// �߾Ӱ� ã��
				// ����Ƚ���� ��ü ���� ���ݿ� �� ��ģ�ٸ�
				if(count < (N+1)/2) {
					count = count + arr[i];
					median = i-4000;
				}
				
				// �ֺ� ã��
				// ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				if(mode_max < arr[i]) {
					mode_max = arr[i]; //�󵵼� ����
					mode = i-4000; // �ֺ� ����
					flag = true; // ù �����̹Ƿ� �ϴ� true�� �ٲ� 
				}
				//���� �ֺ� �ִ밪�� ������ ���鼭 �� ���� �ߺ��Ǵ� ���
				else if(mode_max == arr[i] && flag == true) {
					mode = i-4000;
					flag = false;
				}
			}
			
		}
		
		System.out.println((int)Math.round((double)sum / N));	// ������ 
		System.out.println(median);	// �߾Ӱ� 
		System.out.println(mode);	// �ֺ� 
		System.out.println(max - min);	// ���� 
		
	}
}
