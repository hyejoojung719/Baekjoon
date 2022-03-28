import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int k = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
				k = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(k);
	}
}
