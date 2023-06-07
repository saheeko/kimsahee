package q614;

import java.util.Scanner;

public class SchoolExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		int Grade = sc.nextInt();
//		Name = sc.next();
//		Grade = sc.nextInt();
		School s = new School();

		s.Name  = "Jejuelementary";
		s.Grade  = 6;
		
		School s1 = new School(Name, Grade);
		sc.close();
//		s1.Name = Name;
//		s1.Grade = Grade;
	   
	      System.out.println(s.Grade + " grade in "+ s.Name + " School");
	      System.out.println(s1.Grade + " grade in "+ s1.Name + " School");
	 
	}

}


