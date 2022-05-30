import java.util.Arrays;
import java.util.Scanner;

// 세수정렬
// 알고리즘 : 정렬
public class BOJ2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}
