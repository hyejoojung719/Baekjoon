import java.util.Scanner;

public class Ex01 {
	 public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c-b <= 0) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}

	}
}

// 기본수학, 사칙연산
// 손익분기점 
// C : 노트북 가격
// A : 고정 비용(대수 상관 x)
// B : 가변 비용
// 노트북 한대 생산 비용 : A+B
// 이익 : C-(A+B)
// 손익 분기점 : 최초로 이익이 발생하는 지점
// 손익분기점 출력(없으면 -1)

// 시간 초과에서 애먹음

// n = a/(c-b)는 총 비용과 수익이 같아지는 지점
// 따라서 수익이 발생하려면 a/(c-b)에 +1
// 수익이 발생하지 않는 지점은 
// a/(c-b) + 1 > 0 이 수식이 0보다 크다는 것은 수익이 발생했다는 것 
// 만약 a/(c-b)+1임 음수라면 수익이 없다는 것 
// a는 고정비용이니, c-b가 음수이면 된다...
