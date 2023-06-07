package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		int min = 1000;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (min > a[i]) {
				min = a[i];
		}
	}
		sc.close();
		System.out.println(min);
	}
}
