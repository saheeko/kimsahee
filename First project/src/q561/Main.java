package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int min = 10000;
		int max = 0;
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
			for (int i=0; i<a.length; i++) {
			if (100 > a[i]) {
				if(a[i] > max) {
					max = a[i];
				}
			}
			if(100 < a[i]) {
				if(a[i] < min) {
					min = a[i];
			}
		}
			
	}
		if(max ==0) {
			max = 100;
		}
		if(min == 10000) {
			min = 100;
		}
		sc.close();
		System.out.print(max+ " ");
		System.out.println(min);
	}
}
