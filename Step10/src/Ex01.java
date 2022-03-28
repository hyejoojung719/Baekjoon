import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 브루트포스 알고리즘 
// 일일이 첨부터 끝까지 계산하며 답을 찾는 알고리즘
// 문제는 숫자가 커질 수록 시간 복잡도가 커진다...
// 브루트포흐 종류 (자료구조에 따라 2종류로 나뉨)
// 1. 선형 구조 - 순차탐색
// 2. 비선형구조 - BFS, DFS
public class Ex01 {
	
	
	public static int sum(int[] arr, int N, int M) {
		int result = 0;
		
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum == M) {
						return sum;
					}
					
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		// 블랙젝
		// 카드의 합이 M을 넘지 않는 한도 내에서 
		// N장의 카드 중에 3장의 카드를 골라
		// M을 넘지 않으며 M과 최대한 가깝게 만든다. 
		
		// 카드의 개수 M과 합 N을 입력받음.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		System.out.println(sum(arr, N, M));
		
		
	}
}
