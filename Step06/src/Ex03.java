import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		//97~122
		int[] chArr = new int[26];
		for(int i=97; i<=122; i++) {
			chArr[i-97] = i;
		}
		
		
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<str.length(); j++) {
				if((char)chArr[i] == str.charAt(j)) {
					chArr[i]=j;
					break;
				}else if((j+1) == str.length()) {
					chArr[i]=-1;
					break;
				}
			}
		}
		
		
		
		for(int i=0; i<chArr.length; i++) {
			System.out.print(chArr[i] + " ");
		}
		
	}
}
