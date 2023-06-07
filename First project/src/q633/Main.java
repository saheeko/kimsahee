package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.println("number? ");
		
		int num = sc.nextInt();
		System.out.println();
		
		if(num == 1) {
			System.out.println("Seoul");
		}else if(num == 2 ) {
			System.out.println("Washington");
		}else if(num == 3) {
			System.out.println("Tokyo");
		}else if(num == 4) {
			System.out.println("Beijing");
		}else {
			System.out.println("none");
			break;
		}
	}sc.close();	
}
}

