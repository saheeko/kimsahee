package q596;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a1 = sc.next();
		int b = sc.nextInt();
		sc.close();
		
//		for(int i = a1.length()-1; (b > 0 && i >= 0); i--,b --) {
//			System.out.print(a1.charAt(i));
//		}
		if (a1.length() < b) {
			System.out.println(a1);
		} else {
			System.out.println(b);
		}
		
	}
}
