import java.util.Scanner;

// ���б���
// �˰��� : ����, ���ڿ�
public class BOJ2789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String str2 = "CAMBRIDGE";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				if(str.charAt(i)==str2.charAt(j)) {
					break;
				}else if(j == str2.length()-1) {
					result += str.charAt(i);
				}
			}
		}
		
		System.out.println(result);
	}
}
