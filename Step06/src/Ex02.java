
public class Ex02 {
	
	public static int d(int n) {
		
		int sum = n;
		
		while(n!=0) {
			sum = sum + n%10;
			n = n/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[10000];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = d(i+1);
		}
		
		for(int i= 1; i<=10000; i++) {
			
			int count=0;
			for(int j=0 ; j<arr.length; j++){
				if(i != arr[j]) {
					count++;
				}
				if(count == 10000) {
					System.out.println(i);
				}
			}
		}
	}
}
