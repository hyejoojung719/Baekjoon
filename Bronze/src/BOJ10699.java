import java.text.SimpleDateFormat;
import java.util.Date;

// ���� ��¥
public class BOJ10699 {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date now = new Date();
		
		String nowTime = sdf1.format(now);
		
		System.out.println(nowTime);
		
		// LocalDate date = LocalDate.now();�� �ص� �ȴ�.
	}
}
