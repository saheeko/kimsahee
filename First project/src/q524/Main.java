package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean c = (a*b != 0);
		boolean d = (b+a != 0);
		
		System.out.print(c + " ");
		System.out.println(d);
		sc.close();
	}

}
