
public class Ex01 {

}

//dist : �� �� ������ �Ÿ��� ��� ���·� ��Ÿ�� 2���� ���� �迭 
//����� ���� �����ϵ��� ������ ���� ���� ���� ��� ����� ���� ���� ������ ���ʺ��� ���ʴ�� 2���� �迭 ���·� return
//return : 2���� �迭 
//���� �ٸ� �� ���� ���� ��ġ�� ���� ��� ����
//�� ��ȣ : 0~
//�׻� ������ �����ؾ���,,,,
//���� �迭�� ������ ���� ������ ���������� �����ͺ��� �������..
//dist �� ���� = dist �� ����

// ex) [[0,5,2,4,1],[5,0,3,9,6],[2,3,0,6,3],[4,9,6,0,3],[1,6,3,3,0]] �Է�
// ex) [[1,2,0,4,3],[3,4,0,2,1]] ���

/*
 �� �� ������ �Ÿ��� ��� ���·� ��Ÿ�� 2���� ���� �迭 dist�� �Ű������� �־����ϴ�. 
 ����� ���� �����ϵ��� ������ ���� ���� ���� ��� ����� ���ؼ� ���� ������ ���ʺ��� 
 ���ʴ�� ��� 2���� �迭 ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * */


/*
 * ���� ����
 	2 �� dist�� ��(����) ���� �� 100
	dist�� ��(����) ���� = dist�� ��(����) ����
		0 �� dist�� ���� �� 100,000,000
		i = j�� ��, dist[i][j] = 0
		i �� j�� ��, dist[i][j] > 0
		��, ���� �ٸ� �� ���� ���� ��ġ�� ���� ���� �����ϴ�.
	���� ��ȣ�� 0���� (dist�� ��(����) ���� - 1)�����Դϴ�.
	���� �迭�� �� ���� ���� ������ ���� ������ ���� �ͺ��� ������� ��ƾ� �մϴ�.
	�׻� ������ �����ϴ� ��츸 �Է����� �־����ϴ�. 
 * */

/*
 class Solution {
    public int[][] solution(int[][] dist) {
        int[][] answer = {};
        return answer;
    }
}
 */