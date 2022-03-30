import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
 
//BOJ 1181 �ܾ����� -> �� �ڵ�� �ʹ� ����������,, �ᱹ �ش� ����
public class Ex08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. ���̰� ª�� �ͺ���
		// 2. ���̰� ������ ���� ������
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for(int i=0; i<str.length; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str[0]).append('\n');
		
		for(int i=1; i<N; i++) {
			if(!str[i].equals(str[i-1])) {
				sb.append(str[i]).append('\n');
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
