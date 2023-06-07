package q195;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MainExam sh = new MainExam();
		sh.setName(sc.next());
		sh.setTel(sc.next());
		sh.setAddr(sc.next());
		sc.close();

		System.out.println("name : " + sh.getName());
		System.out.println("tel : " + sh.getTel());
		System.out.println("addr : " + sh.getAddr());
	}

}
