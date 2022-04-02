
public class Ex03 {

	/*
	 두 송전탑 A, B 사이에 전력을 공급하기 위한 송전 선로를 연결하려 합니다.
	  송전탑과 송전 선로는 그래프 형태로 표현이 가능하며, 
	  각 노드는 송전탑, 송전탑과 송전탑을 연결하는 간선은 송전 선로를 나타냅니다. 
	  모든 송전 선로(간선)의 가중치는 1 입니다. 당신은 아래 규칙을 지키며 
	  송전 선로를 적절히 선택하여 A 송전탑에서 B 송전탑까지 연결하는 경로를 만들려 합니다.
			-해당 경로에 포함되는 송전 선로의 가중치 합이 k 이하여야 합니다.
			-같은 송전탑을 두 번 이상 지나면 안됩니다.
	 * */
	// 두 송전탑 A,B 사이에 전력을 공급하기 위한 송전 선로 연결
	// 송전탑과 송전 선로는 그래프 형태로 표현 가능
	// 간선은 송전 선로, 노드는 송전탑
	// 모든 송전 선로(간선)의 가중치는 1
	
	// 규칙1. 해당 경로에 포함되는 송전 선로의 가중치 합이 k이하
	// 규칙2. 같은 송전탑을 두 번 이상 지나면 안됨
	
	// n: 전체 송전탑 수를 나타내는 정수
	// edges : 송전 선로 정보가 담긴 2차원 정수 배열
	// k : 가중치를 나타내는 정수
	// a : A 송전탑의 노드 번호를 나타내는 정수
	// b : B 송전탑의 노드 번호를 나타내는 정수
	
	// A 송전탑에서 B송전탑 까지 가중치 합이 k이하인 경로에 포함되지 않는 송전 선로를 모두 제거한 뒤 
	// 남은 송전 선로는 몇개인지 return
	
	
	/* 제한 사항
	 2 ≤ n ≤ 16
		송전탑 번호는 0부터 시작합니다.
	n - 1 ≤ edges의 세로(행) 길이 ≤ min(50, n(n-1)/2)
	edges의 가로(열) 길이 = 2
		edges의 각 행은 [P, Q] 형태입니다.
		P, Q는 송전탑 번호를 나타내며, 송전 선로가 두 노드 P, Q를 연결하고 있음을 나타냅니다.
		0 ≤ P ≤ n - 1, P는 자연수
		0 ≤ Q ≤ n - 1, Q는 자연수
		P ≠ Q
		임의의 두 송전탑 사이에는 정확히 하나의 송전 선로(간선)만 존재하며, 같은 송전 선로(간선)에 대한 정보가 중복해서 주어지지 않습니다.
		임의의 서로 다른 두 송전탑을 연결하는 경로가 항상 있는 경우만 입력으로 주어집니다.
	1 ≤ k ≤ 8
	0 ≤ a ≤ n - 1
	0 ≤ b ≤ n - 1
	a 송전탑과 b 송전탑을 연결하는 경로가 없는 경우는 입력으로 주어지지 않습니다.
	 */
	
	// 입력 n=8, edges = [[0,1],[1,2],[2,3],[4,0],[5,1],[6,1],[7,2],[7,3],[4,5],[5,6],[6,7]]
	// k=4, a=0, b=3
	// 출력 result=7
	
	
	/*
	 class Solution {
    public int solution(int n, int[][] edges, int k, int a, int b) {
        int answer = -1;
        return answer;
    }
}
	 * */
}
