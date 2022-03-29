import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		// N�� Ȧ���� �����ϴ�. 
		// ���1. ��� ��� : N���� ������ ���� N���� ����
		// ���2. �߾Ӱ� : N���� ������ ������������ �������� �� �� �߾ӿ� ��ġ�ϴ� �� 
		// ���3. �ֺ� : N���� ���� �� ���� ���� ��Ÿ���� �� 
		// ���4. ���� : N���� ���� �� �ִ밪-�ּҰ�(����)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		int[] data = new int[N]; // �Է¹޴� ���� ���� �迭 
		
		for(int i=0; i<data.length; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(data); // �迭�� ������������ ����
		
		//1. ������
		double sum=0; // N���� ������ �� �Ҽ����� ���;��ϹǷ� double�� ����
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		bw.write(Math.round(sum/N) + "\n"); // �ݿø��Լ� Math.round�̿�
		
		//2. �߾Ӱ�
		bw.write(data[N/2] + "\n"); 
		
		//3. �ֺ� -> ���⼭ ����� 
		// ī���� �迭 ����(ũ��) : �Է¹��� �������� �ִ밪 + �ּҰ� + 1 
		// ī���� �迭 �ε��� = ����+�ּҰ� 
		int range = Math.abs(data[N-1] + Math.abs(data[0]) + 1);
		int[] cnt = new int[range];
		
		for(int i=0; i<data.length; i++) {
			int idx = data[i]+Math.abs(data[0]); // ī���� �迭 �ε����� ���� + �ּҰ��� �ȴ�. 
			cnt[idx]++;
		}
		
		int max = 0; 
		for(int i=0; i<cnt.length; i++) {
			if(max < cnt[i]) {
				// cnt�迭�� ��ȸ�ϸ鼭 max������ ū ���ڰ� ��Ÿ�� ��� max������ ��´�. 
				max = cnt[i];
			}
		}
		// max�� cnt�迭�� �ִ밪�� �� ��. 
		
		int flag = 0; // �ߺ� üũ
		int check = 0; // max���� ���� ���� ���� ���� index ����
		for(int i=0; i<cnt.length; i++) {
			if(max == cnt[i]) {
				flag++;
				check = i;
				
				// ���� flag�� 2�� �ȴٸ�, �ߺ��� �ֺ� ���� �̹� �� ��°�� ���� ���� �ش�ǹǷ�.. 
				if(flag == 2) {
					bw.write((i-Math.abs(data[0]))+"\n");
					break;
				}
				
			}
		}
		
		// ���� for���� ������ �������� flag�� ��� 1�� ���, �ֺ� �ߺ��� �����ٴ� ���
		if(flag == 1) {
			bw.write((check-Math.abs(data[0]))+"\n");
		}
		
		//4. ����
		bw.write(Math.abs(data[N-1]-data[0]) + "\n");
	
		
		bw.flush();
		bw.close();
		br.close();
	}
}
