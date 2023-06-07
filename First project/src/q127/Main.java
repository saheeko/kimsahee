package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;
          
         while(true) {
           
         int number=sc.nextInt();
         
         if(number > 100 || number < 0) {
            break;
            }else {
                cnt++;
                sum += number;
            }
          
         }
         sc.close();
         System.out.println("sum : "+sum);
         System.out.printf("avg : %.1f",(double)sum/cnt);

	}
}