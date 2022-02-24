import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] arr2 = new int[42];
		int count = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			int j = arr[i]%42;
			arr2[j]++;
		}
		
		for(int i = 0 ; i <arr2.length ; i++) {
			if(arr2[i] != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
