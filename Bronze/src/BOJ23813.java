import java.util.Scanner;

// ȸ��
// �˰��� : ���ڿ�, ����, ����, ��Ģ����
public class BOJ23813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numStr = sc.next();
		
		long sum = 0;
		char tmp;
		char[] numCh = numStr.toCharArray();
		for(int i=0; i<numCh.length; i++) {
			
			for(int j=0; j<numCh.length; j++) {
				tmp  = numCh[j];
				numCh[j] = numCh[numCh.length-1];
				numCh[numCh.length-1] = tmp;
			}
			
			sum += Integer.parseInt(String.valueOf(numCh));
		}
		
		System.out.println(String.valueOf(sum));
	}
}
