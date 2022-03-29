import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//BOJ 2108 통계학 + 카운팅 정렬
public class R_Ex04_02 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 입력값의 범위 : -4000 ~ 4000;
		int[] arr = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		int median = 10000; // 중앙값 변수
		int mode = 10000; // 최빈값 변수
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value; // 합계
			
			// 카운팅 하는 배열
			arr[value + 4000]++; // 범위가 -4000부터 시작하므로 만약 -4000을 입력받을 경우 인덱스0 에 들어가야함
			// 따라서 4000을 더해줌
			
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
			
		}
		
		int count = 0; // 중앙값 빈도 누적 수
		int mode_max = 0; // 최빈값의 최대값
		boolean flag = false; // 이전의 동일한 최빈값이 1번만 등장헀을 경우 true, 아닐경우 false
		
		for(int i=min+4000; i <= max+4000; i++) {
			
			if(arr[i] > 0) {
				// 중앙값 찾기
				// 누적횟수가 전체 길의 절반에 못 미친다면
				if(count < (N+1)/2) {
					count = count + arr[i];
					median = i-4000;
				}
				
				// 최빈값 찾기
				// 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
				if(mode_max < arr[i]) {
					mode_max = arr[i]; //빈도수 저장
					mode = i-4000; // 최빈값 저장
					flag = true; // 첫 등장이므로 일단 true로 바꿈 
				}
				//이전 최빈값 최대값과 동일한 경우면서 한 번만 중복되는 경우
				else if(mode_max == arr[i] && flag == true) {
					mode = i-4000;
					flag = false;
				}
			}
			
		}
		
		System.out.println((int)Math.round((double)sum / N));	// 산술평균 
		System.out.println(median);	// 중앙값 
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 
		
	}
}
