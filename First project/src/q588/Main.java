package q588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
//				System.out.print(a[i]+" ");
			if (a[i] == 0) {
				for (int j = i-1; j >= 0; j--) {
					System.out.print(a[j] + " ");
				}
				sc.close();
				break;

			}

		}

	}
}
