import java.util.ArrayList;
import java.util.Scanner;

// 수 이어가기
// 알고리즘 : 수학, 브루트포스 알고리즘
public class BOJ2635 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int cnt = 0; // 최대 크기
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// 여기서 핵심은 두번째 양의 정수는 무조건 start 수보다 작아야함.. 
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
