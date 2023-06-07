package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a+=5;
		b*=2;
		sc.close();
		System.out.println("width = " + a);
		System.out.println("length = " + b);
		System.out.println("area = " + (a*b));
	}

}
