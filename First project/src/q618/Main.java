package q618;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      List<Member> Human = new ArrayList<Member>();
      //배열안에는 멤버만 들어갈수 있다,      
      for(int i = 0; i<5; i++) {
         // 반복문을 5번돌면서 멤버객체 5개생성하고 이름 키 몸무게 데이터 셋팅
         
         //객체생성
         Member m = new Member(); //객체셍성
         
         //생성된 객체에 데이터셋팅
         m.setName(sc.next()); //이름셋팅
         m.setHeight(sc.nextInt()); //키셋팅
         m.setWeight(sc.nextDouble()); //몸무게셋팅
         
         //데이터까지셋팅된 객체를 배열에 넣기
         Human.add(m); // 이름 키 몸무게가 셋팅된 객체를 배열에 넣는다 
         
         //이짓을 5번반복하면 Human 이라는 배열에 객체가 5개가 들어가게된다.
      }
      
      Member.minName(Human);//이름사전 별로 정렬 하는 메소드 실행
      System.out.println();
      Member.hmem(Human); // 무게별로 정렬하는 메소드실행
   }

}