public class Arraytest {
   public static void main(String[] args) {
      int[][] a = new int[5][5];
      int x =1;
      int sum = 0;
      for(int i = 0; i < 5; i++) {   //배열 을 초기화
         for(int j = 0; j < 5; j++) {
            a[i][j] = x;
            x++;
         }
      }
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            System.out.printf("%4d",a[i][j]);   //4칸씩 잡아서 출력
         }
         System.out.println("");
         }
      for(int i = 0; i < 5; i++) {
         for(int j = 0; j < 5; j++) {
            if(i>0 && i>j) {
               sum = sum + a[i][j];
            }
         }
      }
      System.out.println(sum);
      }
   }