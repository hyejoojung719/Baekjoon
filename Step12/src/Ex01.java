import java.util.Scanner;

// �� ����
// 1. ���� ���� 
// 	- �ּ� ���� ���� : �������� 
//  - �ִ� ���� ���� : ��������
//  - (1) �ε��� �� �� ����, ������ �迭�� �� ���� ���� �� ã��
//  - (2) ���� �� �� �� ã����, �� ���� ���� �ε��� ���� �ٲ���
//  - (3) ���� �ε������� �� ���� �ݺ�
// 2. ���� ����
//  - ���� ��ġ���� �� ������ �迭���� ���Ͽ� �ڽ��� �� ��ġ�� ã��, �� ��ġ�� �����ϴ� �迭 �˰���
// 3. ���� ����
//  - ���ӵ� �� �� �ε����� ���Ͽ�, ���������� ��� ū ���� �ڷ� �̵���.. 
// 4. �պ� ���� 
// 5. �� ����

// �̹����� �������ķ� Ǯ��
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		int[] arr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min;
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min=j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
