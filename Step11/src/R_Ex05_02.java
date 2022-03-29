import java.io.BufferedReader;
import java.io.InputStreamReader;

//BOJ 1427 소트 인사이드
//카운팅 정렬 + charAt + 버퍼
public class R_Ex05_02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] counting = new int[10]; // 숫자 0~9가 들어오므로
		String s = br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			counting[s.charAt(i) - '0']++;
		}
		
		for (int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				//counting[i]가 0이 될때까지.. 즉 --와 > 합친  형태
				//즉 counting[9]가 3이면 9가 3번 출력 될 것이다. 
				//애초에 0이면 실행x
				System.out.print(i);
			}
		}
	}
}
