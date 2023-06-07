package q9114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			char a = sc.next().charAt(0);
			if (a >= 97 && a <= 122) {
				System.out.println("소문자입니다.");
			} else if (a >= 65 && a <= 90) {
				System.out.println("대문자입니다.");
			} else if (a >= 48 && a <= 57) {
				System.out.println("숫자문자입니다.");
			} else {
				System.out.println("영문, 숫자 이외의 문자입니다.");
				break;
			}
		}
		sc.close();
	}

}
