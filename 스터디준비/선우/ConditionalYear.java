package 스터디준비.선우;

import java.util.Scanner;

public class ConditionalYear {
    public static void main(String[] args) {
        System.out.println("연도를 입력해주세요.");
        int year = new Scanner(System.in).nextInt();
        System.out.println((year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) ? 1 : 0);
    }
}
