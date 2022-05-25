import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가장 많은 글자
// 알고리즘 : 구현, 문자열
public class BOJ1371 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String sum="";
		String str="";
		
		while((str = br.readLine()) != null) { 
			// 공백제거
			str = str.replace(" ", "");
			sum += str;
		}
		
		
		char[] arr = sum.toCharArray();
		int[] cnt = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			cnt[arr[i]-97]++;
		}
		
		int max = 0;
		for(int i=0; i<cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
			}
		}
		
		String result = "";
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i] == max) {
				result += (char)(i+97);
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
