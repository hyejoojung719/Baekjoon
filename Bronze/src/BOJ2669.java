import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직사각형 네개의 합집합의 면적 구하기
// 알고리즘 : 구현
public class BOJ2669 {
	public static void main(String[] args) throws Exception{
		// 왼X, 왼Y, 오X, 오Y
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[101][101];
		
		for(int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int lx = Integer.parseInt(st.nextToken());
			int ly = Integer.parseInt(st.nextToken());
			int rx = Integer.parseInt(st.nextToken());
			int ry = Integer.parseInt(st.nextToken());
			
			for(int x=lx; x<rx; x++) {
				for(int y=ly; y<ry; y++) {
					arr[x][y] = 1;
				}
			}
		}
		
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]==1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
