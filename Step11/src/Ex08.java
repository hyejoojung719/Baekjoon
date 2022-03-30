import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
 
//BOJ 1181 단어정렬 -> 내 코드는 너무 더러워져서,, 결국 해답 참고
public class Ex08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 1. 길이가 짧은 것부터
		// 2. 길이가 같으면 사전 순으로
		
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
