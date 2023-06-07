package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double [] num = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%.1f", num[a-1]+num[b-1]);
		sc.close();
		
	}

}
