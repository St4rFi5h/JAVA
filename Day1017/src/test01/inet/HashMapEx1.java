package test01.inet;


import java.util.*;
public class HashMapEx1 {
   public static void main(String[] args) {
      HashMap map = new HashMap();
      map.put("myId", "1234");
      map.put("hana", "1111");
      map.put("mana", "1234");
      
      Scanner sc = new Scanner(System.in); 
      
      while(true) {
         System.out.println("id를 입력해주세요. ");
         System.out.print("id : ");
         String id = sc.nextLine().trim();
         
         
         
         if(!map.containsKey(id)) {
            System.out.println("입력하신 id 는 존재하지 않습니다 다시 입력해주세요.");
            continue;
         }else {
            System.out.print("password :");
            String password = sc.next();
            System.out.println();
            if(!(map.get(id)).equals(password)) {
               System.out.println("비밀번호가 일치하지 않습니다.");
            } else {
               System.out.println("로그인 되었습니다.");
               break;
            }
         }
      }
      sc.close();
   }
}