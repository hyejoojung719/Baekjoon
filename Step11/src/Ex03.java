import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// �� �����ϱ�3
public class Ex03 {
	public static void main(String[] args) throws Exception{
		// N���� ���ڰ� �־�����
		// �̸� �������� ����
		// ���� : 3��
		// �޸� ���� : 512MB
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] counting = new int[10001]; // �־��� ���� ���� 1~10000, �ε��� �����ؼ� +1��.
		
		for(int i=0; i<N; i++) {
			int index = Integer.parseInt(br.readLine());
			counting[index]++; // �� ���� ������ ����
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<counting.length; i++) {
			for(int j=0; j<counting[i]; j++) {
				// �����ϴ� �� ��ŭ �ش� ����(�ε���) ���
				//System.out.println(i); -> �ð��ʰ���
				//String Builder�� ���� ���� -> String�� ���ڿ��� ���� �� ���ο� ��ü�� �ƴ� ������ �����Ϳ� ���ϴ� ����� ����ϱ� ������ ��������� �ӵ��� ������ ���ϰ� ����.
				sb.append(i + "\n");
			}
		}
		
		bw.write(sb.toString()); // StringBuilder�� ���� �̷��� �������� �Ѵ�. 
		br.close();
		bw.flush();
		bw.close();
		
	}
}

// ī���� ���� (counting-sort, �������), O(n)�� �ð����⵵�� ������(��û ����)
// ����1. ���� ����ִ� array �迭�� �� �� ��ȸ�ϸ�, �� ���� ���� ������ �ش� ���� index�� �ϴ� counting�迭�� �� 1������Ŵ
		// counting ����� �� ���� ������ ����ִ� �迭�� �ȴ�.
// ����2. counting�迭�� �� ���� ���������� ��ȯ��Ŵ. 
		// ��, counting[1] += counting[0] -> counting[2] += counting[1]... �̷������� 
		// �̷��� counting�迭�� �� ���� (������-1)�� �ȴ�. 
// ����3. �� ���� 7�� �����Ϸ��� �Ҷ�, counting[7] = 12�̴�. 
		// ���⼭ counting[7]�� ���� 1�� ���� ���� ���ο� �迭 result[11]�� ��ġ�ϰ� �ȴ�. 
		// ������ ������ ���� array ������ index���� ��ȸ���ִ°� ����. 
//�ٸ�, ī���� �迭�� ȿ��������  ������ ������ ���̺��� ���� ������ �ش������� Ŭ ��� �޸𸮰� ����� �� �ִ�.. 