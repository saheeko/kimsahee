package q532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
//		&& 이 용어는 and 연산
		if (a >= 4.0 && b >= 4.0) {
			System.out.println("A");
		}else if(a >= 3.0 && b >= 3.0){
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}

}
