import java.util.Scanner;

// �ǽù� �˹�
// �˰��� : ����
public class BOJ1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int[] arr = new int[100];
		for(int i=0; i<tc; i++) {
			int num = sc.nextInt();
			arr[num-1]++;
		}
		
		int dec = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>1) {
				dec+=arr[i]-1;
			}
		}
		
		System.out.println(dec);
		
	}
}
