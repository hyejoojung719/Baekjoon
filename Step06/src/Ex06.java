import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals("")) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
