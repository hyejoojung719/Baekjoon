import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열 분석
// 브론2
// 구현, 문자열
public class BOJ10820 {
	public static void main(String[] args) throws Exception{
		// 소문자, 대문자, 숫자, 공백 개수를 구분해 출력하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		while(true) {
			str = br.readLine();
			if(str == null) break;
			char[] chArr = str.toCharArray();
			
			int lower, upper, num, space;
			lower=upper=num=space=0;
			
			for(char x : chArr) {
				if(Character.isLowerCase(x)) lower++;
				else if(Character.isUpperCase(x)) upper++;
				else if(x>=48 && x<=57) num++;
				else if(x == 32) space++;
			}
			
			System.out.println(lower + " " + upper + " " + num + " " + space);
		}
		
	}
}
