import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		// �������� ���� �������� Ǯ��..
		// �׷� 1, 6, 12, 18... ������ �� ������ �����Ѵ�. 
		// �� 1, 2, 8, 20.. ������ ���� ��ȣ�� �ٲ�..
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // �� ��° ��?
		int cnt = 1; // �ּ� ��Ʈ ��
		int start_point = 2; /// ������ 2���� ����Ѵ�. 
		
		if(N == 1) {
			System.out.println(1);
		}else {
			while(!(start_point > N)) {
				// �������� ���Ϸ��� N������ Ŭ �� �ݺ��� ����
				
				// ���� N=13�̶� 13��° ����� ���� ������ ���Ϸ� �Ҷ�
				// 2 < 13 �̹Ƿ� while�� ����
				// start_point = 2 + 6*1 = 8
				// cnt = 2
				
				// 8 < 13 �̹Ƿ� while�� ����
				// start_point = 2 + 6*1 + 6*2 =20
				// cnt = 3
				
				// 20 > 13 �̹Ƿ� while�� ����
				
				start_point = start_point + (6*cnt);
				
				cnt++; // �� index ���� 
			}
			System.out.println(cnt);
		}
	}
}

// 1�� �� ���� N�� �� ���� �ּ� ������ ���� ������ �� �� �� ���� ���� �������°�
// �Է� : N
// ��� : �氳��(�ּ�)


/*
���������� �ڵ�� �����߾���

���� ������ � ������ �̷������ �� ����
(1) , (2~7), (8~19), (20~37) ...
���� �� : 1, 2, 8, 20, 38.. => �������� (������ 6�� ���)
�ᱹ N�� ���������� n��° �װ� ������ ���̿� �ִٸ�, ���������� n��° ���� �ּҷ� �鸰 ���� ������ �ȴ�.
�׷��� �Ʒ� Ǯ�̴� �ʹ� ��ư� �����ؼ� Ǭ ����..
 
Scanner sc = new Scanner(System.in);

int n = sc.nextInt(); // N �Է� ����

int a1 = 1; // ������ ù ��° �� a1=1
int c = 1; // ��� ��(�氳��)


while(true) {
	int sum = 0;
	for(int k=1; k<=(c-1); k++) {
		sum = sum + 6*k; 
	}
	int an = a1 + sum;
	
	int presum = 0;
	for(int k=1; k<=(c-2); k++) {
		presum = presum + 6*k;
	}
	int prean = a1 + presum;
	
	
	if(n > presum && n <= an) {
		System.out.println(c);
		break;
	}else {
		c++;
	}
}
*/



