import java.util.Scanner;


public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		
		String str = sc.nextLine();
	
		char[] arr = new char[size];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum += ((int)arr[i]-48);
		}
		System.out.println(sum);
	}
}
