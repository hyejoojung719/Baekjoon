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
		//Ȧ�� : ���ڴ� n-1���� ���� / �и�� 1���� ����
		//¦�� : ���ڴ� 1���� ���� / �и�� n-1���� ����
		//nth�� ���õǸ�
		//n-1���� �׷쿡�� nth-prean+1 ��°�� �ش��ϴ� �м��� ����Ѵ�
		
		int A = 1; // �и�
		int B = 1; // ����
		if((n-1)%2 != 0 ) {
			// Ȧ�� �� ��
			int k = nth-prean+1; // �׷쳻���� �� ��°����..
			B = k;
			A = n-1-(k-1);
			
		}else {
			// ¦�� �� ��
			int k = nth-prean+1;
			B = n-1-(k-1);
			A = k;
		}
		
		System.out.println(A + "/" + B);
		
		
	}
}
