import java.util.Scanner;

// 수 정렬
// 1. 선택 정렬 
// 	- 최소 선택 정렬 : 오름차순 
//  - 최대 선택 정렬 : 내림차순
//  - (1) 인덱스 맨 앞 부터, 이후이 배열값 중 가장 작은 값 찾기
//  - (2) 가장 작 은 값 찾으면, 그 값을 현재 인덱스 값과 바꿔줌
//  - (3) 다음 인덱스에서 위 과정 반복
// 2. 삽입 정렬
//  - 현재 위치에서 그 이하의 배열들을 비교하여 자신이 들어갈 위치를 찾아, 그 위치에 삽입하는 배열 알고리즘
// 3. 버블 정렬
//  - 연속된 두 개 인덱스를 비교하여, 오름차순의 경우 큰 값이 뒤로 이동함.. 
// 4. 합병 정렬 
// 5. 퀵 정렬

// 이번에는 선택정렬로 풀기
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int[] arr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min;
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min=j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
