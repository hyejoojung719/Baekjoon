import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=m; i<=n; i++) {
			if(i==2) {
				arr.add(i);
			}else {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						break;
					}else {
						if(j == i-1) {
							arr.add(i);
							break;
						}
						continue;
					}
				}
			}
		}
		
		
		if(arr.size() == 0) {
			System.out.println(-1);
		}else {
			int sum=0;
			for(int i=0; i<arr.size(); i++) {
				sum += arr.get(i);
			}
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
		
		
	}
}
