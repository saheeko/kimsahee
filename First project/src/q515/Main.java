package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result1 = a*b;
		int result2 = a/b;
		
		System.out.println(a+ " * " + b + " = " + result1);
		System.out.println(a+ " / " + b + " = " + result2);
	}

}
