import java.util.Scanner;

// 별찍기 15
// 알고리즘 : 구현
public class BOJ10990 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean flag = true;
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-(i+1); j++) {
				System.out.print(" ");
			}
			if(i==0) {
				System.out.print("*");
			}else {
				for(int j=0; j<2; j++) {
					System.out.print("*");
					if(flag) {
						for(int k=0; k<2*i-1; k++) {
							System.out.print(" ");
						}
						flag=false;
					}
				}
			}
			System.out.println();
			flag = true;
		}
	}
}
