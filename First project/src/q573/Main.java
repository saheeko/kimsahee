package q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MainExam sh = new MainExam();
		
		sh.run(n);
		sc.close();
	}

}
class MainExam {
	void run(int n) {
		int x =1;
	for (int i = 0; i < n; i++) { //세로 4번
		for(int j = 0; j< n; j ++) { //가로 4번
			System.out.print(x++ + " ");
		}
		System.out.println();
	}	
}
}
