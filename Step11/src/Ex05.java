import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// ��Ʈ �λ��̵�
// �迭 �������� ����
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Integer[] arr = new Integer[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		Arrays.sort(arr,Collections.reverseOrder()); 
		// ���� �迭�� int���� Integer�� �ٲ���....
		//Collections�� ��ü������ ����� ������ �޼ҵ�
		//int[]�� ��ü�� �ƴ� Primary type�� 
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
