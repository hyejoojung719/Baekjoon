
public class RecursionPractice {
	
	public static int sum;
	public static int loop = 0;
	
	public static int func(int num) {
		
		sum = num;
		
		
		if(num == -1) {
			return 0; // ���� ���� ���(���ÿ����÷ο� ����)
		}
		
		sum += func(num-1); // sum = sum + num;
		// func(5)�� ����ǰ� ������� �����ϸ� func(4).... func(0)���� ����...
		// ��, �� �Ʒ��� func(0)�� ����ǰ� �Ʒ� �ڵ尡 ����ȴ�...
		loop++;
		System.out.println("��� ���� Ƚ�� : " + loop);
		System.out.println("Test sum: " + sum);
		System.out.println("Test num: " + num);
		System.out.println("--------------------------");
		return sum;
	}
	
	public static void main(String[] args) {
		
		// ��� �׽�Ʈ 
		System.out.println(func(5));
	}
}
