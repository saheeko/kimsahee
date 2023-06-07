package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] a =new String[10];
		for(int i = 0; i<a.length;i++) {
			a[i]= sc.next();
			
		}
		System.out.printf("%s %s %s",a[0],a[3],a[6]);
		sc.close();
	}
	
}
