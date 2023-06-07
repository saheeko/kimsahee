package q573;

public class MainExam {
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