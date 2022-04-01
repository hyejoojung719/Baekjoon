import java.util.ArrayList;
import java.util.Scanner;

// BOJ 2576 È¦¼ö
public class BOJ2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		ArrayList<Integer> li = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		boolean flag = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sum += arr[i];
				flag = false;
				li.add(arr[i]);
			}
		}
		
		
		if(flag) {
			System.out.println(-1);
		}else {
			int min = li.get(0);
			for(int i=0; i<li.size(); i++) {
				if(min > li.get(i)) {
					min = li.get(i);
				}
			}
			
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
}
