import java.util.Scanner;

// 학점계산
// 알고리즘 : 구현, 문자열
public class BOJ2754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = sc.next();
		
		if(score.equals("A+")) System.out.print(4.3);
		else if(score.equals("A0")) System.out.print(4.0);
		else if(score.equals("A-")) System.out.print(3.7);
		else if(score.equals("B+")) System.out.print(3.3);
		else if(score.equals("B0")) System.out.print(3.0);
		else if(score.equals("B-")) System.out.print(2.7);
		else if(score.equals("C+")) System.out.print(2.3);
		else if(score.equals("C0")) System.out.print(2.0);
		else if(score.equals("C-")) System.out.print(1.7);
		else if(score.equals("D+")) System.out.print(1.3);
		else if(score.equals("D0")) System.out.print(1.0);
		else if(score.equals("D-")) System.out.print(0.7);
		else System.out.print(0.0);
		
	}
}
