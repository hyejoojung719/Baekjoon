import java.util.Scanner;

// 직사각형에서의 탈출 
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// x, y, w, h 입력 받음
		// 직사각형의 가로 : w
		// 직사각형의 세로 : h
		// 직선으로 가는게 최단 거리
		// x, y, w-x, h-y 중 가장 작은 수 찾기
		
		int[] arr = new int[4];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt()-arr[0];
		arr[3] = sc.nextInt()-arr[1];
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(i == arr.length-1) {
				System.out.println(min);
			}
		}
		
	}
}
