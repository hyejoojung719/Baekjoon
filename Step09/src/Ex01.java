import java.util.Scanner;

// ���丮��, ���
// ����Լ� : �Լ��� ������������ �ڽ��� ȣ���ϴ� ���μ���
public class Ex01 {
	
	// ���丮�� �޼ҵ�
	public static int factorial(int num) {
		
		if(num<=1) 
			return  1;
		else
			return num*factorial(num-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(factorial(num));
	}
}
