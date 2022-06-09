import java.util.Scanner;

// 첫글자를 대문자로
// 알고리즘: 구현, 문자열
public class BOJ4458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<tc; i++) {
			String str = sc.nextLine();
			
			char[] arr = str.toCharArray();
			arr[0] = Character.toUpperCase(arr[0]);
			
			str = String.valueOf(arr);
			
			
			System.out.println(str);
		}
	}
}
