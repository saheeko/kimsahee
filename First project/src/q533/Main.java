package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		      String a = sc.next();
		      int b = sc.nextInt();
		      
		      switch(a) {
		      case "F":
		         if(18>b)
		         System.out.println("GIRL");
		         else if(18<=b) {
		            System.out.println("WOMAN");
		            }
		         break;
		      case "M":
		         if(18>b)
		            System.out.println("BOY");
		         else if(18<=b)
		            System.out.println("MAN");
		         break;
		      }
		        

		}

}
