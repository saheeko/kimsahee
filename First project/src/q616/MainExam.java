package q616;

import java.util.Scanner;

public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Main s = new Main();
		s.x1=sc.nextDouble();
		s.y1=sc.nextDouble();
		s.x2=sc.nextDouble();
		s.y2=sc.nextDouble();
		s.x3=sc.nextDouble();
		s.y3=sc.nextDouble();
		sc.close();
		
		System.out.printf("(%.1f, %.1f)",(s.x1+s.x2+s.x3)/3,(s.y1+s.y2+s.y3)/3);
			
	}

}
