import java.io.BufferedReader;
import java.io.InputStreamReader;

//BOJ 1427 ��Ʈ �λ��̵�
//ī���� ���� + charAt + ����
public class R_Ex05_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] counting = new int[10]; // ���� 0~9�� �����Ƿ�
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			counting[s.charAt(i) - '0']++;
		}
		
		for (int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				//counting[i]�� 0�� �ɶ�����.. �� --�� > ��ģ  ����
				//�� counting[9]�� 3�̸� 9�� 3�� ��� �� ���̴�. 
				//���ʿ� 0�̸� ����x
				System.out.print(i);
			}
		}
	}
}
