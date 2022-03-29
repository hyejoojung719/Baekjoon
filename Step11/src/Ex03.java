import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 수 정렬하기3
public class Ex03 {
	public static void main(String[] args) throws Exception{
		// N개의 수자가 주어지고
		// 이를 오름차순 정렬
		// 제한 : 3초
		// 메모리 제한 : 512MB
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] counting = new int[10001]; // 주어진 수의 범위 1~10000, 인덱스 생각해서 +1함.
		
		for(int i=0; i<N; i++) {
			int index = Integer.parseInt(br.readLine());
			counting[index]++; // 각 값의 개수를 담음
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<counting.length; i++) {
			for(int j=0; j<counting[i]; j++) {
				// 존재하는 수 만큼 해당 숫자(인덱스) 출력
				//System.out.println(i); -> 시간초과뜸
				//String Builder를 쓰는 이유 -> String고 문자여를 더할 때 새로운 객체가 아닌 기존의 데이터에 더하는 방식을 사용하기 때문에 상대적으로 속도가 빠르고 부하가 적다.
				sb.append(i + "\n");
			}
		}
		
		bw.write(sb.toString()); // StringBuilder를 쓰고 이렇게 출력해줘야 한다. 
		br.close();
		bw.flush();
		bw.close();
		
	}
}

// 카운팅 정렬 (counting-sort, 계수정렬), O(n)의 시간복잡도를 가진다(엄청 빠름)
// 과정1. 값이 들어있는 array 배열을 한 번 순회하며, 각 값이 나올 때마다 해당 값을 index로 하는 counting배열의 값 1증가시킴
		// counting 배얄은 각 값의 개수가 담겨있는 배열이 된다.
// 과정2. counting배열의 각 값을 누적합으로 변환시킴. 
		// 즉, counting[1] += counting[0] -> counting[2] += counting[1]... 이런식으로 
		// 이러면 counting배열의 각 값은 (시작점-1)이 된다. 
// 과정3. 즉 숫자 7을 배정하려고 할때, counting[7] = 12이다. 
		// 여기서 counting[7]의 값에 1을 빼준 값이 새로운 배열 result[11]에 위치하게 된다. 
		// 안정적 정렬을 위해 array 마지막 index부터 순회해주는게 좋다. 
//다만, 카운팅 배열을 효과적으로  쓰려면 수열의 길이보다 수위 범위가 극단적으로 클 경우 메모리가 낭비될 수 있다.. 