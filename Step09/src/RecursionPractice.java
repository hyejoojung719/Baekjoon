
public class RecursionPractice {
	
	public static int temp;
	
	public static int func(int num) {
		
		temp = num;
		
		if(num == -1) {
			return 0;
		}
		
		temp += func(num-1); // temp = temp + num;
		// func(5)가 실행되고 여기까지 도착하면 func(4).... func(0)까지 진행...
		// 즉, 이 아래는 func(0)이 실행되고 아래 코드가 실행된다...
		
		System.out.println("Test temp: " + temp);
		System.out.println("Test num: " + num);
		System.out.println("--------------------------");
		return temp;
	}
	
	public static void main(String[] args) {
		
		// 재귀 테스트 
		func(5);
	}
}
