package training01p0412;
// 읽은 정숫값의 대소 관게를 표시 (틀린 버전)
import java.util.Scanner;

public class BalanceWrong {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("변수 a:"); int a = stdIn.nextInt();
		System.out.print("변수 b:"); int b = stdIn.nextInt();
		
		int diff = a - b;
		if (diff > 0)
			System.out.println("a가 크다.");
		else if (diff < 0)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b가 같다.");

	}

}
