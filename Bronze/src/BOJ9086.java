import java.util.Scanner;

// 문자열
// 알고리즘 : 문자열, 구현
public class BOJ9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<num; i++) {
			String str = sc.nextLine();
			
			char[] arr = str.toCharArray();
			
			System.out.println(Character.toString(arr[0])+Character.toString(arr[arr.length-1]));
		}
	}
}
