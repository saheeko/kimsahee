package q114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		++a;
		System.out.printf("%d %d\n" , a,b);
		b--;
		System.out.printf("%d %d",a,b);
	}

}
