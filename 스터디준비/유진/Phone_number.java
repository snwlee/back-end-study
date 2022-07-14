package Test;

import java.util.Scanner;

public class Phone_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder pn = new StringBuilder();
		
		pn.append(scan.next());
		
		for(int i=0; i<pn.length()-4; i++) {
			pn.setCharAt(i, '*');
		}
		System.out.println(pn.toString());
	}

}
