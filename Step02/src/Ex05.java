import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m = m-45;
		
		if(m<0) {
			h=h-1;
			m=m+60;
			
			if(h<0) {
				h = h+24;
			}
		}
		
		System.out.println(h + " " + m);
	}
}
