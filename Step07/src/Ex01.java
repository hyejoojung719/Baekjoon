import java.util.Scanner;

public class Ex01 {
	 public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c-b <= 0) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}

	}
}

// �⺻����, ��Ģ����
// ���ͺб��� 
// C : ��Ʈ�� ����
// A : ���� ���(��� ��� x)
// B : ���� ���
// ��Ʈ�� �Ѵ� ���� ��� : A+B
// ���� : C-(A+B)
// ���� �б��� : ���ʷ� ������ �߻��ϴ� ����
// ���ͺб��� ���(������ -1)

// �ð� �ʰ����� �ָ���

// n = a/(c-b)�� �� ���� ������ �������� ����
// ���� ������ �߻��Ϸ��� a/(c-b)�� +1
// ������ �߻����� �ʴ� ������ 
// a/(c-b) + 1 > 0 �� ������ 0���� ũ�ٴ� ���� ������ �߻��ߴٴ� �� 
// ���� a/(c-b)+1�� ������� ������ ���ٴ� �� 
// a�� ��������̴�, c-b�� �����̸� �ȴ�...
