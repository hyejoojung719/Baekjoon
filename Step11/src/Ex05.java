import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 소트 인사이드
// 배열 내림차순 정렬
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Integer[] arr = new Integer[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		Arrays.sort(arr,Collections.reverseOrder()); 
		// 위에 배열을 int형을 Integer로 바꿔줌....
		//Collections는 객체에서만 사용이 가능한 메소드
		//int[]는 객체가 아닌 Primary type임 
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
