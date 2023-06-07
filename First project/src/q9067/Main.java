package q9067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		
		for(int i = 0; i < a.length; i ++) {
			a[i] =sc.nextInt();
		}
		System.out.printf("%d %d %d" ,a[2],a[4],a[9]);
		sc.close();
	}

}
