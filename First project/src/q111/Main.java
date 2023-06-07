package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//
//		int sum = a+b+c+d;
//		System.out.println("sum "+ sum);
//		System.out.println("avg " + sum/4);
//		sc.close();
	      Scanner sc = new Scanner(System.in);
	      
	      int a[] = new int[4];
	      int sum = 0;
	      int check = 0;

	       
	      
	      for(int i = 0; i<a.length; i++) {
	         a[i] = sc.nextInt();
	         sum += a[i];//sum 합계값 sum = sum + a[i]
	         check++; //4
	         
	      }
	      int avg = sum/check;
	      sc.close();
	      System.out.println("sum " + sum);
	      System.out.println("avg " + avg);

	}

}
