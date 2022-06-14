import java.util.Scanner;

// 꿍 가라사대
// 알고리즘 : 구현, 문자열
public class BOJ11094 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<tc; i++) {
			String str = sc.nextLine();
			
			String[] strArr = str.split(" ");
			
			for(int j=0; j<strArr.length-1; j++) {
				if(strArr[j].equals("Simon")) {
					if(strArr[j+1].equals("says")) {
						for(int k=j+2; k<strArr.length-1; k++) {
							System.out.print(" "+strArr[k]);
						}
						System.out.println(" "+strArr[strArr.length-1]);
					}
				}
			}
		}
	}
}
