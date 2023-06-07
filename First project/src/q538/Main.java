package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("number? ");
			int a = sc.nextInt();
			
			if(0<a) {
				System.out.println("positive integer");
			}else if(0>a) {
				System.out.println("negative number");
			}else if (a==0) {
				sc.close();
				break;
			}
		}
	}

}
