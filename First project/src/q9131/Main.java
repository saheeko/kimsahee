package q9131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		int Age = sc.nextInt();
		
		MainExam sh = new MainExam();
		
		sh.Name = "손예준";
		sh.Age=12;
		
		MainExam sh1 = new MainExam(Name, Age);
		sc.close();
		
		System.out.println("당신의 이름 : " + sh.Name + "," + " 나이 : " + sh.Age );
		System.out.println("친구의 이름 : " + sh1.Name + "," + " 나이 : " + sh1.Age );
		
	}

}
class MainExam {
	String Name;
	int Age;
	
	MainExam(){
	}
	MainExam(String n, int a){
		Name = n;
		Age = a;
}
}
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        System.out.println("친한 친구의 이름을 입력하세요");
//        MainExam f = new MainExam();
//        MainExam s = new MainExam();
//        
//        s.setName(sc.next());
//        s.setAge(sc.nextInt());
//        f.setName("손예준");
//        f.setAge(12);
//        System.out.println("당신의 이름 : " + f.getName()+", "+"나이 : "+ f.getAge());
//        System.out.println("친구의 이름 : " + s.getName()+", "+"나이 : "+ s.getAge());
//
//        sc.close();
//
//
//    }
//
//}