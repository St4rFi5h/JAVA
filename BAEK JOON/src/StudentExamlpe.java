class People {
   public String name;
   public  String  number;

   public People (String name , String number) {
      this.name = name;
      this.number = number;
   }
}






   class Student extends People {
      public int studentNo;

      public void prtInfo () {
         System.out.println ("name: " + name);
         System.out.println ("number: " + number); 
         
      }
     
      public Student ( String name,String number, int studentNo ) {
         super (name, number);
         this.studentNo = studentNo;
      }

      
      
      
      
      
      
      
      
      
      
   }
    	public class StudentExamlpe {
    		 
         public static void main(String[] args) {
            Student student = new Student("ȫ�浿","123456-12321421",1);
            System.out.println("name : " + student.name);
            System.out.println("ssn : " + student.number);
            System.out.println("studentNo : " + student.studentNo);
         }

      }
      