import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] grid = new String[N];
		
		for(int i=0; i<grid.length; i++) {
			grid[i] = br.readLine();
		}
		
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length(); j++) {
				System.out.println(grid[i].charAt(j));
			}
		}
		
		br.close();
		
		
		
	}
}

/*
 * 
 ���ڰ� �ֽ��ϴ�. ������ �� ĭ���� 'a', 'b', 'c', �Ǵ� '?'�� ���� �ֽ��ϴ�. 
 ����� '?'�� ����ִ� ��� ĭ���� '?'�� ����� 'a', 'b', �Ǵ� 'c'�� ���, 
 ���� ���ڰ� ���� ĭ���� �����¿�� ���� �����ϰ� �ͽ��ϴ�. 
 ���� ���, ���� ���� ��a���� �� 3�� �ִٸ� 3���� ��a���� ��� �����¿�� ����Ǿ�� �մϴ�. 
 ��b��, ��c���� �ִٸ� ���������� ���� ��� ����Ǿ�� �մϴ�.
���ڸ� ��Ÿ���� 1���� ���ڿ� �迭 grid�� �Ű������� �־����ϴ�. '
?'�� 'a', 'b', �Ǵ� 'c'�� �ٲپ ���� ���ڸ� ������ �ִ� ĭ������ �����¿�� 
���� ����ǵ��� �ϴ� ��� ����� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 **/
// ���� -> a, b, c, ?
// ���� ���ڰ� ���� ĭ���� �����¿�� ���� �����ؾ���
// �Ű����� String[] grid 
// ?�� a, b, c�� �ٲ㼭 ���� ���ڸ� ������ �ִ� ĭ ������ �����¿�� ���� ����ǵ��� �ϴ� ��� ����� �� return

// ex) �Է� : ["??b", "abc", "cc?"] ��� :2
// ["abcabcab","????????"], 0
// ["aa?"],3


// ���� ����
// 1<= grid����(��) <=9
// 1<= grid�� �� ����(��) <=9
// 1<=grid�� ?���� <=9

/*
 class Solution {
    public int solution(String[] grid) {
        int answer = -1;
        return answer;
    }
}
 * */
