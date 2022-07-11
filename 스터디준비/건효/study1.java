package javastudy1;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		
		System.out.print("년도를 입력해주세요:>>");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4 == 0) {
			if(year%400 !=0 && year%100 == 0)
				System.out.println("0");
			else
				System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
