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
         System.out.println("id�� �Է����ּ���. ");
         System.out.print("id : ");
         String id = sc.nextLine().trim();
         
         
         
         if(!map.containsKey(id)) {
            System.out.println("�Է��Ͻ� id �� �������� �ʽ��ϴ� �ٽ� �Է����ּ���.");
            continue;
         }else {
            System.out.print("password :");
            String password = sc.next();
            System.out.println();
            if(!(map.get(id)).equals(password)) {
               System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
            } else {
               System.out.println("�α��� �Ǿ����ϴ�.");
               break;
            }
         }
      }
      sc.close();
   }
}