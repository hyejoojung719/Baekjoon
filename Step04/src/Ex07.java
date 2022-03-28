import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		double[] avgArrOver = new double[testCase];
		
		for(int i = 0 ; i < testCase ; i++) {
			int stuNum = sc.nextInt();
			int[] scoreArr = new int[stuNum];
			for(int j = 0 ; j < scoreArr.length ; j++) {
				scoreArr[j] = sc.nextInt();
			}
			
			int sum = 0 ;
			double avg = 0;
			for(int k = 0 ; k < scoreArr.length; k++) {
				sum += scoreArr[k];
			}
			avg = (double)sum/stuNum;
			
			int count = 0;
			for(int l = 0 ; l < scoreArr.length ; l++) {
				if(scoreArr[l] > avg) {
					count++;
				}
			}
			
			avgArrOver[i] = (double)count/stuNum*100;
			
		}
		
		for(int i = 0 ; i < avgArrOver.length ; i++) {
			System.out.println(String.format("%.3f", avgArrOver[i])+"%");
		}
		
	}
}
