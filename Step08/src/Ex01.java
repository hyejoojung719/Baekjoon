import java.util.Scanner;

public class Ex01 {
	 public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		if(c-b <= 0) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}

	}
}
