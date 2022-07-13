package Test_0714;

import java.util.Scanner;

public class PhonNumberConceal {
	public static void main(String[] args) { // 메인 메서드
		System.out.println(concealPhoneNumber(inputPhoneNumber()));
	}
	static String inputPhoneNumber() { // 전화번호 입력 및 조건판별 메서드
		System.out.print("전화번호를 입력해주세요 >> ");
		String phone_number = new Scanner(System.in).nextLine();
		if ( 4 <= phone_number.length() && phone_number.length() <= 20) { // 번호가 4자리 이상, 20자리 이하일때만 리턴
			return phone_number; 
		} 
		System.out.println("4자리 이상, 20자리 이하의 번호를 입력해주세요");
		return inputPhoneNumber();
	}
	static String concealPhoneNumber(String phone_number) { // 전화번호 가리기 메서드
		StringBuilder sb = new StringBuilder(phone_number);
		for(int i=0; i<phone_number.length()-4; i++) {
			sb.setCharAt(i, '*');
		}
		return sb.toString();
	}
}
