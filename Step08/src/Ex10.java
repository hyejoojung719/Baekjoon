import java.util.Scanner;

//택시 기하학
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc .nextInt();
		
		// 유클리드 기하학에서 원의 넓이 : 파이*r*r
		// 택시 기하학에서 원의 넓이 :  2*r*r
		
		System.out.println(Math.round(Math.PI*r*r*1000000)/1000000.0);
		System.out.println(Math.round(2*r*r*1000000)/1000000.0);

	}
}
