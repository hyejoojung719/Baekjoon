import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] arr = new String[12];
		
		arr[0] = "";
		arr[1] = "";
		arr[2] = "";
		arr[3] = "ABC";
		arr[4] = "DEF";
		arr[5] = "GHI";
		arr[6] = "JKL";
		arr[7] = "MNO";
		arr[8] = "PQRS";
		arr[9] = "TUV";
		arr[10] = "WXYZ";
		arr[11] ="";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<arr[j].length(); k++){
					if(str.charAt(i) == arr[j].charAt(k)) {
						count += j;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
