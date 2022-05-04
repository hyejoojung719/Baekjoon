import java.util.Scanner;

// 2007��
// �˰��� : ����
public class BOJ1924 {
	public static void main(String[] args) {
		// 2007�� 1�� 1�� : ������
		// 2007�� x�� y�� ���� ����???
		// 1 3 5 7 8 10 12 �� 31��
		// 4 6 9 11 �� 30��
		// 2�� 28��
		
		// ex) 12�� 25��
		// 31*6+30*4+28 = 186+120+28 = 306+28 = 334
		// 334+25 = 359
		// ������ �Ǵ� 0~6
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day = 0;
		
		for(int i=1; i<x; i++) {
			if(i==2) {
				day += 28;
			}else if(i==4 || i==6 || i==9 || i==11) {
				day += 30;
			}else {
				day += 31;
			}
		}
		
		day += y;
		
		int r = day%7;
		
		switch(r) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			default:
				System.out.println("SAT");
				break;
		}
	}
}
