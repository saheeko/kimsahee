package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int c = a + b;
		int d = a * b;
		System.out.print("두 수를 입력하시오. ");
		
		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " * " + b + " = " + d);

	}

}
