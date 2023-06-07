package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int b1 = sc.nextInt();
	
//		boolean c = (a>b) && (b==b1);
		boolean c = (a > b) && (a > b1);
		boolean d = (a == b) && (b == b1);
		System.out.print(c+ " ");
		System.out.println(d);
		sc.close();
		
	}

}
