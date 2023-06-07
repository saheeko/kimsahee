package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("yard? ");
		double a = sc.nextDouble();
		sc.close();
				
		System.out.printf("%.1fyard = ",a);
		
		double b = a*91.44;
		System.out.printf("%.1fcm",b);
		

	}

}
