import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nth = sc.nextInt();
		
		int a1 = 1;
		int n=1;
		int an;
		int prean;
		while(true) {
			
			int sum=0;
			for(int k=1; k <= n-1; k++) {
				sum += k;
			}
			an = a1 + sum;
			
			int presum=0;
			for(int k=1; k <= n-2; k++) {
				presum += k;
			}
			prean = a1 + presum;
			
			if(nth < an && nth >= prean) {
				break;
			}else {
				n++;
			}
			
		}
		
		//n-1 
		//A+B : n
		//홀수 : 분자는 n-1부터 시작 / 분모는 1부터 시작
		//짝수 : 분자는 1부터 시작 / 분모는 n-1부터 시작
		//nth가 제시되면
		//n-1번쨰 그룹에서 nth-prean+1 번째에 해당하는 분수를 출력한다
		
		int A = 1; // 분모
		int B = 1; // 분자
		if((n-1)%2 != 0 ) {
			// 홀수 일 때
			int k = nth-prean+1; // 그룹내에서 몇 번째인지..
			B = k;
			A = n-1-(k-1);
			
		}else {
			// 짝수 일 때
			int k = nth-prean+1;
			B = n-1-(k-1);
			A = k;
		}
		
		System.out.println(A + "/" + B);
		
		
	}
}
