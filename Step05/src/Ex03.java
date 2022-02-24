import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mp = a*b*c;
		String mpToS = String.valueOf(mp);
		char[] arr = mpToS.toCharArray();
		int[] arr2 = new int[10];
 		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				if((arr[i] - '0') == j) { // Character.getNumericValue(arr[i]) 쓸 수도 있음 
					arr2[j]++;
				}
			}
		}
		
		for(int i = 0 ; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
}
