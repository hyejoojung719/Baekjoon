import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		String[] arr = new String[num];
		int[] scoreArr = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0 ; i < num ; i++) {
			int count = 0;
			int score = 0;
			for(int j = 0 ; j < arr[i].length() ; j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
					score += count;
					scoreArr[i] = score;
				}else {
					count = 0;
				}
			}
		}
		
		for(int i=0 ; i < scoreArr.length ; i++) {
			System.out.println(scoreArr[i]);
		}
		
		sc.close();
		
		
	}
}
