package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		 while(true) {
			 int c = sc.nextInt();
			 if(c == 0) {
					break;
			 }else if(c%2==0) {
				 b++;

			 }else if(c%2!=0) {
				 a++;
				
			 }
		
			 
		 } sc.close();
		 System.out.println("odd : " + a);
		 System.out.println("even : " + b);

	} 
}
