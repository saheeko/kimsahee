package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			String str = sc.next();
			char a = str.charAt(0);
			
	
			if('A' <= a && a <='Z' ) { //대문자
				System.out.println(a);
			}else if ('a' <= a && a <= 'z') {// 소문자
				System.out.println(a);
			}else if('0' <= a && a <='9') {//숫자
				System.out.println((int)a);
			}else {
				sc.close();
				break;
			}
		}
	}
}