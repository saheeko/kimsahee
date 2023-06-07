package q613;

import java.util.Scanner;

public class BeolmalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		String School = sc.next();
		int Grade = sc.nextInt();
		
		//생성자 이용
		Beolmal s1 = new Beolmal(Name, School, Grade);
		//생선자 없이 생성
//		Beolmal s = new Beolmal();
//		s.Name = sc.next();
//		s.School = sc.next();
//		s.Grade = sc.nextInt();
		Name = sc.next();
		School = sc.next();
		Grade = sc.nextInt();
		Beolmal s2 = new Beolmal(Name, School, Grade);
		sc.close();
		
		s2.Name = Name;
		s2.School = School;
		s2.Grade = Grade;
		
//		Beolmal a = new Beolmal();
//		a.Name = sc.next();
//		a.School = sc.next();
//		a.Grade = sc.nextInt();
	      System.out.println("Name : " + s1.Name);
	      System.out.println("School : " + s1.School);
	      System.out.println("Grade : " + s1.Grade);      
	      System.out.println("Name : " + s2.Name);
	      System.out.println("School : " + s2.School);
	      System.out.println("Grade : " + s2.Grade);
	      sc.close();
	     
//	      System.out.println("Name : " + s.Name);
//	      System.out.println("School : " + s.School);
//	      System.out.println("Grade : " + s.Grade);      
//	      System.out.println("Name : " + a.Name);
//	      System.out.println("School : " + a.School);
//	      System.out.println("Grade : " + a.Grade);
//	      sc.close();
	}

}
