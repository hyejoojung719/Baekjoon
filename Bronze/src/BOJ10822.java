import java.util.Scanner;

// 더하기 
// 알고리즘 : 수학, 구현, 문자열, 사직연산, 파싱
public class BOJ10822 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] arr = str.split(",");
	
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}

}
