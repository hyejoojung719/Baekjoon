import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ����
// �����2, ������
// �˰��� : ����
public class BOJ2920 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[8];
		for(int i=0; i<8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+1 == arr[i+1]) {
				cnt++;
			}else if(arr[i]-1 == arr[i+1]){
				cnt--;
			}else continue;
		}
		
		if(cnt==7) {
			System.out.println("ascending");
		}else if(cnt==-7) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}

/*
  �ٸ� Ǯ�� 
  
  �׳� ���� 
  String output ="";
  
  for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+1 == arr[i+1]) {
				output = "ascending"
			}else if(arr[i]-1 == arr[i+1]){
				output = "descending"
			}else {
				output = mixed;
				break;
			}
		}
 * */
