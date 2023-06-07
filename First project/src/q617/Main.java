package q617;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      MainExam [] p = new MainExam[5];
      
      for(int i = 0;i < p.length; i++) {
    	  String name = sc.next();
    	  int height = sc.nextInt();
    	  
    	  p[i]= new MainExam(name, height);
    	}
      sc.close();
      
//      for(int i = 0; i < p.length; i++) {
//    	  p[i].print();
//      }
      MainExam min = p[0];
      for(int i = 0; i <p.length; i++) {
    	  if(min.getHeight() > p[i].getHeight()) {
    		  min = p[i];
    	  }
      }
      min.print();
   }
}