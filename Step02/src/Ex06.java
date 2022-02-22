import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		if((m+t)<60) {
			m = m+t;
		}else {
			
			h = h+((m+t)/60);
			if((24-h)<=0) {
				h=h-24;
			}
			m = (m+t)-60*((m+t)/60);
		}
		
		System.out.println(h + " " + m);
	}
}
