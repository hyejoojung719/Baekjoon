import java.util.Scanner;

// �г��ӿ� �� ���̱�
// �˰��� : ����, ���ڿ�
public class BOJ13163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<tc; i++) {
			String str = sc.nextLine();
			
			String[] arr = str.split(" ");
			
			String str2 = "god";
			for(int j=1; j<arr.length; j++) {
				str2+=arr[j];
			}
			
			System.out.println(str2);
		}
	}
}
