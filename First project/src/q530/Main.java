package q530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a>20) {
		System.out.print("adult");
		}else{
		System.out.println(20-a+" years later");
		}
	}
}

