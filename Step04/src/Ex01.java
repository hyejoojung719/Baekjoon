import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		while(true){
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a<=0 || a>=10 || b<=0 || b>=10) {
				break;
			}
			
			System.out.println(a+b);
		}
	}
}
