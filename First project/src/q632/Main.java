package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int min = 0;
		min = (a < b) ? a : b; 
		min = (min < c) ? min : c; 
		System.out.println(min);
	}

}
