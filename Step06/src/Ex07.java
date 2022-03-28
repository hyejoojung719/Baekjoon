import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int newNum1 = num1%10*100 + num1/10%10*10 + num1/100;
		int newNum2 = num2%10*100 + num2/10%10*10 + num2/100;
		
		if(newNum1 > newNum2) {
			System.out.println(newNum1);
		}else {
			System.out.println(newNum2);
		}
		
	}
}
