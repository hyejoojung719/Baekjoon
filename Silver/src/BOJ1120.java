import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열
// 알고리즘 : 구현, 문자열, 브루트포스 알고리즘, KMP알고리즘
public class BOJ1120 {
	public static void main(String[] args) throws Exception {
		
		// X의 길이는 Y의 길이보다 작거나 같다
		// X와 Y의 길이가 같으면서 X[i] != Y[i]인 i의 개수를 최소로 하도록 하는 프로그램 작성
		
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
			// 길이가 다를 때 이므로
			// X가 Y와 길이가 같아지도록 X앞 또는 X뒤에 알파벳을 추가하되 차이를 최소로 하도록 할 것
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
