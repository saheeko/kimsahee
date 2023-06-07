package q523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + " > " + b + " --- " + (a > b ? true : false));
		System.out.println(a + " < " + b + " --- " + (a < b ? true : false));
		System.out.println(a + " >= " + b + " --- " + (a >= b ? true : false));
		System.out.println(a + " <= " + b + " --- " + (a <= b ? true : false));
		sc.close();
	}

}
