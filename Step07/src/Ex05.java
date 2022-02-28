import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] chArr = new char[str.length()];
		
		for(int i=0; i<chArr.length; i++) {
			if(((int)str.charAt(i) >= 65) && ((int)str.charAt(i) <= 90)) {
				chArr[i] = (char)((int)str.charAt(i)+32);
			}else {
				chArr[i] = str.charAt(i);
			}
		}
		
		int[] cntArr = new int[26];
		for(int i=0; i<chArr.length; i++) {
			cntArr[(int)chArr[i]-97]++;
		}
	
		int max = cntArr[0];
		int idx = 0;
		if(str.length() == 1) {
			for(int i=0; i<cntArr.length; i++) {
				if(cntArr[i] != 0) {
					max = cntArr[i];
					idx = i;
				}
			}
			
		}else {
			for(int i=0; i<cntArr.length-1; i++) {
				if(max < cntArr[i+1]) {
					max = cntArr[i+1];
					idx = i+1;
				}
			}
		}
		
		int dupl = 0;
		for(int i=0; i<cntArr.length; i++) {
			if(max == cntArr[i]) {
				dupl++;
			}
		}
		
		for(int i=0; i<cntArr.length; i++) {
			if(dupl > 1) {
				System.out.println("?");
				break;
			}
			else {
				System.out.println((char)(idx+65));
				break;
			}
		}
		
	}
}
