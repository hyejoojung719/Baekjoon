import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine());
		
		String[] strArr = new String[testCase];
		int[] cntArr = new int[testCase];
		for(int i=0; i<testCase; i++) {
			cntArr[i] = Integer.parseInt(sc.nextLine());
			strArr[i] = sc.nextLine();
		}
		
		for(int i=0; i<testCase; i++) {
			for(int j=0; j<strArr[i].length();j++) {
				for(int k=0; k < cntArr[i];k++) {
					System.out.print(strArr[i].charAt(j));
				}
			}
			System.out.println();
		}
	}
}
