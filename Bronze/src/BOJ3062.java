import java.util.Scanner;

// 수 뒤집기
// 알고리즘 : 수학, 구현, 문자열, 사칙연산
public class BOJ3062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			String input = sc.next();
			char[] arr = input.toCharArray();
			char[] arr2 = new char[arr.length];
			
			for(int j=0; j<arr.length; j++) {
				arr2[j] = arr[arr.length-j-1];
			}
			
			int num1 = Integer.parseInt(String.valueOf(arr));
			int num2 = Integer.parseInt(String.valueOf(arr2));
			
			int result = num1+num2;
			
			char[] arr3 = String.valueOf(result).toCharArray();
			

			boolean flag = true;
			for(int j=0; j<arr3.length/2; j++) {
				if(arr3[j] != arr3[arr3.length-(j+1)]) {
					System.out.println("NO");
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			}
			
		}
	}

}
