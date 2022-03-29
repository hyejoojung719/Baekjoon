import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		// N은 홀수만 가능하다. 
		// 출력1. 산술 평균 : N개의 수들의 합을 N으로 나눔
		// 출력2. 중앙값 : N개의 수들을 오름차순으로 나열했을 때 그 중앙에 위치하는 값 
		// 출력3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값 
		// 출력4. 범위 : N개의 수들 중 최대값-최소값(차이)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		int[] data = new int[N]; // 입력받는 값을 담을 배열 
		
		for(int i=0; i<data.length; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(data); // 배열을 오름차순으로 정렬
		
		//1. 산술평균
		double sum=0; // N으로 나눴을 때 소수점이 나와야하므로 double로 선언
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		bw.write(Math.round(sum/N) + "\n"); // 반올림함수 Math.round이용
		
		//2. 중앙값
		bw.write(data[N/2] + "\n"); 
		
		//3. 최빈값 -> 여기서 고민함 
		// 카운팅 배열 범위(크기) : 입력받은 데이터의 최대값 + 최소값 + 1 
		// 카운팅 배열 인덱스 = 숫자+최소값 
		int range = Math.abs(data[N-1] + Math.abs(data[0]) + 1);
		int[] cnt = new int[range];
		
		for(int i=0; i<data.length; i++) {
			int idx = data[i]+Math.abs(data[0]); // 카운팅 배열 인덱스는 숫자 + 최소값이 된다. 
			cnt[idx]++;
		}
		
		int max = 0; 
		for(int i=0; i<cnt.length; i++) {
			if(max < cnt[i]) {
				// cnt배열을 순회하면서 max값보다 큰 숫자가 나타날 경우 max변수에 담는다. 
				max = cnt[i];
			}
		}
		// max는 cnt배열중 최대값을 뜻 함. 
		
		int flag = 0; // 중복 체크
		int check = 0; // max값과 같은 값을 갖는 곳의 index 저장
		for(int i=0; i<cnt.length; i++) {
			if(max == cnt[i]) {
				flag++;
				check = i;
				
				// 만약 flag가 2가 된다면, 중복된 최빈 값중 이미 두 번째로 작은 값에 해당되므로.. 
				if(flag == 2) {
					bw.write((i-Math.abs(data[0]))+"\n");
					break;
				}
				
			}
		}
		
		// 위에 for문을 끝내고 나왔을때 flag가 계속 1일 경우, 최빈값 중복은 없었다는 얘기
		if(flag == 1) {
			bw.write((check-Math.abs(data[0]))+"\n");
		}
		
		//4. 범위
		bw.write(Math.abs(data[N-1]-data[0]) + "\n");
	
		
		bw.flush();
		bw.close();
		br.close();
	}
}
