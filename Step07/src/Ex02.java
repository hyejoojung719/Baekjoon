import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// 시작점과 방의 개수보고 풀기..
		// 그럼 1, 6, 12, 18... 순으로 방 개수가 증가한다. 
		// 즉 1, 2, 8, 20.. 순으로 시작 번호가 바뀜..
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 몇 번째 방?
		int cnt = 1; // 최소 루트 수
		int start_point = 2; /// 시작점 2부터 고려한다. 
		
		if(N == 1) {
			System.out.println(1);
		}else {
			while(!(start_point > N)) {
				// 시작점이 구하려는 N값보다 클 때 반복문 나감
				
				// 만약 N=13이라서 13번째 방까지 가는 개수를 구하려 할때
				// 2 < 13 이므로 while문 실행
				// start_point = 2 + 6*1 = 8
				// cnt = 2
				
				// 8 < 13 이므로 while문 실행
				// start_point = 2 + 6*1 + 6*2 =20
				// cnt = 3
				
				// 20 > 13 이므로 while문 나감
				
				start_point = start_point + (6*cnt);
				
				cnt++; // 항 index 증가 
			}
			System.out.println(cnt);
		}
	}
}

// 1번 방 부터 N번 방 까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는가
// 입력 : N
// 출력 : 방개수(최소)


/*
계차수열을 코드로 구현했었음

먼저 벌집이 어떤 구조로 이루어지는 지 생각
(1) , (2~7), (8~19), (20~37) ...
시작 점 : 1, 2, 8, 20, 38.. => 계차수열 (차수가 6의 배수)
결국 N이 계차수열의 n번째 항과 다음항 사이에 있다면, 계차수열의 n번째 항이 최소로 들린 방의 개수가 된다.
그러나 아래 풀이는 너무 어렵게 생각해서 푼 문제..
 
Scanner sc = new Scanner(System.in);

int n = sc.nextInt(); // N 입력 받음

int a1 = 1; // 수열의 첫 번째 항 a1=1
int c = 1; // 출력 값(방개수)


while(true) {
	int sum = 0;
	for(int k=1; k<=(c-1); k++) {
		sum = sum + 6*k; 
	}
	int an = a1 + sum;
	
	int presum = 0;
	for(int k=1; k<=(c-2); k++) {
		presum = presum + 6*k;
	}
	int prean = a1 + presum;
	
	
	if(n > presum && n <= an) {
		System.out.println(c);
		break;
	}else {
		c++;
	}
}
*/



