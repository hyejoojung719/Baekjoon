import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		//hashNextInt �̿�!
		while(sc.hasNextInt()) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a+b);
		}
	}
}