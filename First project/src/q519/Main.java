package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int num = (a+100);
		int num2 = (b%10);
		
//		a = a + 100; a += 100;
//		b = b %10; b %=10;
		System.out.print(num + " " + num2);
		
		/*
		 * BufferedReader 
		 * BufferedReader br = new BufferedReader(newInputStreamReader(System.in)); 
		 * StringTokenizer st = newStringTokenizer(br.readLine()); 
		 * String a = st.nextToken();
		 * String b = st.nextToken();
		 * System.out.println(a);
		 * System.out.println(b);
		 * 
		 */

	}

}
