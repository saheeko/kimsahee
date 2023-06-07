package q618;

public class Member {
   
   private String name; 
   private int height;
   private double weight;
   
   
   //====================================================== 무게순으로정렬하는 메소드
   //Main에서 데이터를넣은 배열을가져와서 여기서 정렬할거임 ㅇㅋ?
   public static void hmem(List<Member> Human) {
      Member temp = new Member();   //정렬하기위해선 temp 라는 빈껍대기가하나필요함   
      
      Member [] mem = new Member [5];  //배열로하고싶어서그냥 List에있는값 배열에 다시넣어줌
      
      for(int i = 0 ; i < mem.length; i++) {
         mem[i] = Human.get(i); //List에있는값 배열로 다옮겨담기
      }
      
      // 여기서부터 정렬하는 코드 시작
      for(int i = 0; i < mem.length; i++) {
         for(int j = 0 ; j < mem.length-i-1; j++) {
            if(mem[j].getWeight() < mem[j+1].getWeight()) {
               temp = mem[j+1];
               mem[j+1] = mem[j];
               mem[j] = temp;
            }
         }
      }
      
      System.out.println("weight");
      for(int i = 0 ; i < mem.length; i++) {
         System.out.printf("%s %d %.1f\n",mem[i].getName(),mem[i].getHeight(), mem[i].getWeight());
      }
   }
//====================================================================== 이름순으로정렬
   
   public static void minName(List<Member> Human) {
      Member temp = new Member();      
      Member [] mem = new Member [5];
      
      for(int i = 0 ; i < mem.length; i++) {
         mem[i] = Human.get(i);
      }
      
      for(int i =0 ; i < mem.length; i++) {
         for(int j = 0; j < mem.length-i-1; j++) {
            if(mem[j].getName().compareTo(mem[j+1].getName()) > 0) {
               temp = mem[j+1];
               mem[j+1] = mem[j];     // 왼쪽이크면 1 같으면 0 오른쪽이크면 -1
               mem[j] = temp;
            }
         }
      }   
      System.out.println("name");
      
      for(int i = 0 ; i < mem.length; i++) {
         System.out.printf("%s %d %.1f\n" , mem[i].getName(), mem[i].getHeight(),mem[i].getWeight());
      }
   }   
   //========================================================================
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }
}