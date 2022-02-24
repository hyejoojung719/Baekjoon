import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = num/10; // 2
		int b = num%10; // 6
		int c = a + b; // 8
		int count = 1;
		int newNum = 0;
		
		while(newNum != num) {
			newNum = b*10 + c%10; // 68 84 42 26
			a = newNum/10; // 6 8 4 2 
			b = newNum%10; // 8 4 2 6
			c = a + b; // 14 12 6 8
			
			if(newNum != num) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
