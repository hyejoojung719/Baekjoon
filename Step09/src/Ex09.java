import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// Á÷°¢ »ï°¢Çü
public class Ex09 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		List<List<Integer>> arr = new ArrayList<>();
		
		int tmp = 0;
		while(true) {
			List<Integer> subArr = new ArrayList<>();
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0) break;
			if(a >= b && a >= c) {
				subArr.add(b);
				subArr.add(c);
				subArr.add(a);
			}else if(b >= a && b >= c) {
				subArr.add(a);
				subArr.add(c);
				subArr.add(b);
			}else if(c >= a && c >= b) {
				subArr.add(a);
				subArr.add(b);
				subArr.add(c);
			}
			
			arr.add(subArr);
		}
		
		for(int i=0; i<arr.size(); i++) {
			if(Math.pow(arr.get(i).get(2), 2)== Math.pow(arr.get(i).get(0), 2) + Math.pow(arr.get(i).get(1), 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
