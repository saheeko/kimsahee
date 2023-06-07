package q182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		System.out.print((int) a.charAt(0) + (int) b.charAt(0)+ " ");
		System.out.println(Math.abs((int) a.charAt(0) - (int) b.charAt(0)));
	}
}
