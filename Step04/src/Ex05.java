import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		double[] arr2 = new double[n];

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		for(int i = 0 ; i <arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = ((double)arr[i]/max)*100;
		}
		
		double sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr2[i];
		}
		
		double avg = sum/n;
		System.out.println(avg);


	}
}
