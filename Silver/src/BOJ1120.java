import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���ڿ�
// �˰��� : ����, ���ڿ�, ���Ʈ���� �˰���, KMP�˰���
public class BOJ1120 {
	public static void main(String[] args) throws Exception {
		
		// X�� ���̴� Y�� ���̺��� �۰ų� ����
		// X�� Y�� ���̰� �����鼭 X[i] != Y[i]�� i�� ������ �ּҷ� �ϵ��� �ϴ� ���α׷� �ۼ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String X = st.nextToken();
		String Y = st.nextToken();
		
		
		if(X.length()==Y.length()) {
			int cnt = 0;
			for(int i=0; i<X.length(); i++) {
				if(X.charAt(i) != Y.charAt(i)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}else {
			// ���̰� �ٸ� �� �̹Ƿ�
			// X�� Y�� ���̰� ���������� X�� �Ǵ� X�ڿ� ���ĺ��� �߰��ϵ� ���̸� �ּҷ� �ϵ��� �� ��
			int min = Integer.MAX_VALUE;
			for(int i=0; i<Y.length()-X.length()+1; i++) {
				int cnt=0;
				int k = i;
				for(int j=0; j<X.length(); j++) {
					if(X.charAt(j) != Y.charAt(k+j)) {
						cnt++;
					}
				}
				
				min = Math.min(cnt, min);
			}
			
			System.out.println(min);
		}
		
		
	}
}
