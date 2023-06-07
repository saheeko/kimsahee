package q186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if(a.length() < b.length()) {
			System.out.println(b.length());
		}else {
			System.out.println(a.length());
		}
		sc.close();
	
	}

}
