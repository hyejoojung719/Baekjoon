
public class RecursionPractice {
	
	public static int temp;
	
	public static int func(int num) {
		
		temp = num;
		
		if(num == -1) {
			return 0;
		}
		
		temp += func(num-1); // temp = temp + num;
		// func(5)�� ����ǰ� ������� �����ϸ� func(4).... func(0)���� ����...
		// ��, �� �Ʒ��� func(0)�� ����ǰ� �Ʒ� �ڵ尡 ����ȴ�...
		
		System.out.println("Test temp: " + temp);
		System.out.println("Test num: " + num);
		System.out.println("--------------------------");
		return temp;
	}
	
	public static void main(String[] args) {
		
		// ��� �׽�Ʈ 
		func(5);
	}
}
