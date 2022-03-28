import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
			f: for(int j=1; j<arr[i].length(); j++) {
				if(arr[i].charAt(j-1) != arr[i].charAt(j)) {
					for(int k=0; k<j; k++) {
						if(arr[i].charAt(j) == arr[i].charAt(k)) {
							if(count!=0) {
								count--;
								break f ;
							}
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
	}
}
