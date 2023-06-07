package q522;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a == b) {
			System.out.println("1");
		}else if (a != b) {
			System.out.println("0");
		}
		if(a != b) {
			System.out.println("1");
		}else if (a == b){
			System.out.println("0");
		}
	}
}
//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//
//int c = (a == b) ? 1 : 0;
//int d = (a != b) ? 1 : 0;
//System.out.println(c);
//System.out.println(d);
