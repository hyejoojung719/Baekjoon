import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int[][] arr;
		int[] cnt = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			arr = new int[k+1][n];
			
			for(int j=0; j<k+1; j++) {
				for(int m=0; m<n; m++) {
					if(j==0) {
						arr[j][m] = m+1;
						continue;
					}
					
					int sum=0;
					for(int p=0; p<=m; p++) {
						sum += arr[j-1][p];
					}
					
					arr[j][m] = sum;
				}
			}
			
			cnt[i] = arr[k][n-1];
		}
		
		for(int i=0; i<testCase; i++) {
			System.out.println(cnt[i]);
		}
		
	}
}
