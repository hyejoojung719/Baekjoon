import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

// ����
// �˰��� : ��Ģ����, ���ڿ�, ����
public class BOJ2935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(br.readLine());
		String str = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		
		if(str.equals("+")) {
			System.out.println(a.add(b));
		}else {
			System.out.println(a.multiply(b));
		}
	}
}
