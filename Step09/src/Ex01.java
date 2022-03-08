import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 2) {
				cnt++;
			}else {
				for(int j=2; j<arr[i]; j++) {
					if(arr[i]%j == 0) {
						break;
					}else {
						
						if(j == arr[i]-1) {
							cnt++;
							break;
						}
						
						continue;
					}
				}
			}
		}
		
		System.out.println(cnt);
	}
}
