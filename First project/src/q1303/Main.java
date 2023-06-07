package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x =1;
		for (int i = 0; i < n; i++) { //세로 4번
			for(int j = 0; j< m; j ++) { //가로 5번
				System.out.print(x++ + " ");
			}
			System.out.println();
		}	sc.close();
	}

}
