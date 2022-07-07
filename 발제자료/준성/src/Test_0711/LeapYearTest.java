package Test_0711;

import java.util.Scanner;

public class LeapYearTest {
	
	// 연도입력 메소드
	public static int inputYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년여부를 알고싶은 연도를 입력해주세요 >> ");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		
		int Year = inputYear();
		int result;
		
//		조건1 : 4의 배수
//		조건2 : 100의 배수가 아님
//		조건3 : 400의 배수일 수 있음
		if ( (Year%4 == 0) && (!(Year%100 == 0) || (Year%400 == 0)) ) {
			result = 1;
			System.out.println(result);
		} else {
			result = 0;
			System.out.println(result);
		}
		
		// 테스트코드
//		int ayaer = year.now();
//		int test = Year.isLeap();
		
	}
}
