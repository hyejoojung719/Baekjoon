import java.util.Scanner;

//�ý� ������
public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc .nextInt();
		
		// ��Ŭ���� �����п��� ���� ���� : ����*r*r
		// �ý� �����п��� ���� ���� :  2*r*r
		
		System.out.println(Math.round(Math.PI*r*r*1000000)/1000000.0);
		System.out.println(Math.round(2*r*r*1000000)/1000000.0);

	}
}
