package q571;

import java.util.Scanner;

public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Main sh = new Main();
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i ++) {
			sh.run();
		}
	
		sc.close();
	}

}
// 한 창으로 하는 방법
//Scanner sc = new Scanner(System.in);
//String a = ("~!@#$^&*()_+|");
//int b = sc.nextInt();
//
//
//for(int i = 0; i < b; i ++) {
//	System.out.println(a);
//}
//
//}
