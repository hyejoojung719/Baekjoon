import java.util.Scanner;

// 방번호, 실버5
// 알고리즘 : 구현
public class BOJ1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[9];
		
		int tmp = 0;
		while(N!=0) {
			tmp = N%10; 
			N /= 10;
			
			if(tmp!=9) {
				arr[tmp]++;
			}else {
				arr[tmp-3]++;
			}
			
		}
		
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=1 && arr[i]>cnt) {
				if(i!=6) {
					cnt = arr[i];
				}else {
					if(arr[i]%2==0) {
						cnt = arr[i]/2;
					}else {
						cnt = arr[i]/2+1;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
		
		
		
	}
}
