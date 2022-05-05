import java.util.Scanner;

// ÀúÀÛ±Ç
public class BOJ2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int whole = sc.nextInt();
		int avg = sc.nextInt();
		
		for(int i=whole*avg; i>=0; i--) {
			if(Math.ceil(i/(double)whole)!=avg) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
