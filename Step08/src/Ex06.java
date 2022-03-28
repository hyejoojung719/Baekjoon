import java.util.ArrayList;
import java.util.Scanner;

// 골드 바흐의 추측 (에라토스테네스의 체, 소수 판정)
public class Ex06 {
	
	public static ArrayList<Integer> gbp;// 골드바흐 파티션 담을 배열 
	public static boolean[] prime; 
	public static void get_goldbach(int num) {
		gbp = new ArrayList<>();
		prime = new boolean[num+1]; // 숫자 0도 포함해야하므로 +1
		prime[0] = prime[1] = true; // 0과 1은 소수에서 제외
		
		for(int i=2; i*i <= num; i++) {
			// 소수인 애는 false로 남겨둠
			for(int j=2*i; j <= num; j+=i) {
				prime[j] = true; // 소수가 아닌애들은 true
			}
		}
		
		// 주어진 짝수보다 작은 소수들 중에서
		// 짝수 - 소수 = 소수 가 성립하는 걸 찾기
		// 소수가 여러가지인 경우 두 소수의 차가 가장 작은 것 출력
		
		int cnt = 0; // 여러개 있는지 확인
		for(int i=0; i<prime.length; i++) {
			if(!prime[i]) {
				if(!prime[num-i]) {
					gbp.add(i); 
					cnt++;
				}else {
					continue;
				}
			}else {
				continue;
			}
		}
		
		if(cnt>1) {
			// 골드 파티션 간 차이 담을 배열 생성
			int[] interval = new int[cnt];
			
			for(int i=0; i<cnt; i++) {
				interval[i] = Math.abs((gbp.get(i)-(num-gbp.get(i)))); // 차이 절대값 배열에 담음
			}
			
			// interval 배열중 가장 작은 값 출력
			int min = interval[0];
			int minIndex = 0;
			for(int i=0; i<interval.length; i++) {
				if(min > interval[i]) {
					min = interval[i];
					minIndex = i;
				}
			}
			
			System.out.println(gbp.get(minIndex) + " " + (num-gbp.get(minIndex)));
			
			
		}else {
			System.out.println(gbp.get(0) + " " + (num-gbp.get(0)));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 입력
		int testCase = sc.nextInt();
		
		// 짝수 담을 배열 생성
		int[] inputArr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			// 골드바흐 파티션 출력할 짝수 입력
			inputArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCase; i++) {
			get_goldbach(inputArr[i]);
		}
		
		
	}
}
