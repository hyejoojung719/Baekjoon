import java.util.ArrayList;
import java.util.Scanner;

// ��� ������ ���� (�����佺�׳׽��� ü, �Ҽ� ����)
public class Ex06 {
	
	public static ArrayList<Integer> gbp;// ������ ��Ƽ�� ���� �迭 
	public static boolean[] prime; 
	public static void get_goldbach(int num) {
		gbp = new ArrayList<>();
		prime = new boolean[num+1]; // ���� 0�� �����ؾ��ϹǷ� +1
		prime[0] = prime[1] = true; // 0�� 1�� �Ҽ����� ����
		
		for(int i=2; i*i <= num; i++) {
			// �Ҽ��� �ִ� false�� ���ܵ�
			for(int j=2*i; j <= num; j+=i) {
				prime[j] = true; // �Ҽ��� �ƴѾֵ��� true
			}
		}
		
		// �־��� ¦������ ���� �Ҽ��� �߿���
		// ¦�� - �Ҽ� = �Ҽ� �� �����ϴ� �� ã��
		// �Ҽ��� ���������� ��� �� �Ҽ��� ���� ���� ���� �� ���
		
		int cnt = 0; // ������ �ִ��� Ȯ��
		for(int i=0; i<prime.length; i++) {
			if(!prime[i]) {
				if(!prime[num-i]) {
					gbp.add(i); 
					cnt++;
				}else {
					continue;
				}
			}else {
				continue;
			}
		}
		
		if(cnt>1) {
			// ��� ��Ƽ�� �� ���� ���� �迭 ����
			int[] interval = new int[cnt];
			
			for(int i=0; i<cnt; i++) {
				interval[i] = Math.abs((gbp.get(i)-(num-gbp.get(i)))); // ���� ���밪 �迭�� ����
			}
			
			// interval �迭�� ���� ���� �� ���
			int min = interval[0];
			int minIndex = 0;
			for(int i=0; i<interval.length; i++) {
				if(min > interval[i]) {
					min = interval[i];
					minIndex = i;
				}
			}
			
			System.out.println(gbp.get(minIndex) + " " + (num-gbp.get(minIndex)));
			
			
		}else {
			System.out.println(gbp.get(0) + " " + (num-gbp.get(0)));
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �׽�Ʈ ���̽� �Է�
		int testCase = sc.nextInt();
		
		// ¦�� ���� �迭 ����
		int[] inputArr = new int[testCase];
		
		for(int i=0; i<testCase; i++) {
			// ������ ��Ƽ�� ����� ¦�� �Է�
			inputArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCase; i++) {
			get_goldbach(inputArr[i]);
		}
		
		
	}
}
