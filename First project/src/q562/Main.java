package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = new int [10];
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		double avg = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] =sc.nextInt();
			if(i%2 !=0) {
				sum += a[i];
			}else {
				avg += a[i];
			}
	
		}
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f\n" , (avg/5));
	}
}