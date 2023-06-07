package q575;

import java.util.Scanner;

public class Main {
	public static int naeun(int n1, int n2) {
		int ret = 1;
		for (int i = 0; i < n2; i++) {
			ret *= n1;
		}

		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

//		System.out.println(n1 + " " + n2);
		int r = naeun(n1, n2);
		System.out.println(r);
	}
}
