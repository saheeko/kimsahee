package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt(); //키
		int inq = sc.nextInt(); //몸무게
		sc.close();
		System.out.printf("%d\n",inq+100-inp);
		

		if (inq+100-inp > 0) {
			System.out.println("Obesity");
    	}
	}
}
