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
 격자가 있습니다. 격자의 각 칸에는 'a', 'b', 'c', 또는 '?'가 쓰여 있습니다. 
 당신은 '?'가 들어있는 모든 칸에서 '?'를 지우고 'a', 'b', 또는 'c'를 적어서, 
 같은 글자가 써진 칸끼리 상하좌우로 전부 연결하고 싶습니다. 
 예를 들어, 격자 내에 ‘a’가 총 3개 있다면 3개의 ‘a’가 모두 상하좌우로 연결되어야 합니다. 
 ‘b’, ‘c’가 있다면 마찬가지로 각각 모두 연결되어야 합니다.
격자를 나타내는 1차원 문자열 배열 grid가 매개변수로 주어집니다. '
?'를 'a', 'b', 또는 'c'로 바꾸어서 같은 글자를 가지고 있는 칸끼리는 상하좌우로 
전부 연결되도록 하는 모든 경우의 수를 return 하도록 solution 함수를 완성해주세요.
 **/
// 격자 -> a, b, c, ?
// 같은 글자가 써진 칸끼리 상하좌우로 전부 연결해야함
// 매개변수 String[] grid 
// ?를 a, b, c로 바꿔서 같은 글자를 가지고 있는 칸 끼리는 상하좌우로 전부 연결되도록 하는 모든 경우의 수 return

// ex) 입력 : ["??b", "abc", "cc?"] 출력 :2
// ["abcabcab","????????"], 0
// ["aa?"],3


// 제한 사항
// 1<= grid길이(행) <=9
// 1<= grid각 행 길이(열) <=9
// 1<=grid내 ?개수 <=9

/*
 class Solution {
    public int solution(String[] grid) {
        int answer = -1;
        return answer;
    }
}
 * */
