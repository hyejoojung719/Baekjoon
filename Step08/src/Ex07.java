import java.util.Scanner;

// ���簢�������� Ż�� 
public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// x, y, w, h �Է� ����
		// ���簢���� ���� : w
		// ���簢���� ���� : h
		// �������� ���°� �ִ� �Ÿ�
		// x, y, w-x, h-y �� ���� ���� �� ã��
		
		int[] arr = new int[4];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt()-arr[0];
		arr[3] = sc.nextInt()-arr[1];
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(i == arr.length-1) {
				System.out.println(min);
			}
		}
		
	}
}
