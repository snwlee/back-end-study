package Test_0711;

import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) { // 메인 메서드
		int year = InputYear();
		int result = resultJudge(year);
		System.out.println(result);
	}
	public static int InputYear() { // 연도입력 및 입력조건 판별 메서드
		Scanner scanner = new Scanner(System.in);
		int inputYear = scanner.nextInt();
		if (1 <= inputYear && inputYear <= 4000 ) {
			return inputYear;
		}  else {
			System.out.println("1보다 크거나 같고 4000보다 작거나 같은 자연수를 입력해주세요.");
			return InputYear(); 
		}
	}
	public static int resultJudge(int year) { // 윤년여부 판별 메서드
		if (( year%4 == 0) && (!(year%100 == 0) || (year%400 == 0)) ) {
			return 1; // 윤년
		} 
		return 0; // 평년
	}
}
