import java.util.ArrayList;
import java.util.Scanner;

// �� �̾��
// �˰��� : ����, ���Ʈ���� �˰���
public class BOJ2635 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 0; // �ִ� ũ��
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// ���⼭ �ٽ��� �ι�° ���� ������ ������ start ������ �۾ƾ���.. 
		for(int i=input; i>=1; i--) {
			ArrayList<Integer> tmpList = new ArrayList<>();
			
			tmpList.add(input);
			
			int first  = input;
			int second = i;
			while(true) {
				
				if(first < 0 ) break;
				
				int third = first;
				
				if(second>=0) tmpList.add(second);
				
				first = second;
				second = third - first;
			}
			if(cnt < tmpList.size()) {
				cnt = tmpList.size();
				list = tmpList;
			}
		}
		
		System.out.println(cnt);
		for(Integer result : list) System.out.print(result + " ");
	}
}
