
public class RecursionPractice {
	
	public static int sum;
	public static int loop = 0;
	
	public static int func(int num) {
		
		sum = num;
		
		
		if(num == -1) {
			return 0; // 종료 시점 명시(스택오버플로우 방지)
		}
		
		sum += func(num-1); // sum = sum + num;
		// func(5)가 실행되고 여기까지 도착하면 func(4).... func(0)까지 진행...
		// 즉, 이 아래는 func(0)이 실행되고 아래 코드가 실행된다...
		loop++;
		System.out.println("재귀 실행 횟수 : " + loop);
		System.out.println("Test sum: " + sum);
		System.out.println("Test num: " + num);
		System.out.println("--------------------------");
		return sum;
	}
	
	public static void main(String[] args) {
		
		// 재귀 테스트 
		System.out.println(func(5));
	}
}
