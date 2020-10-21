package test01.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
   InetAddress ip = null;
   String ip1 = null;
   public void testInetAddressEx00() throws Exception{
      testInetAddress();
   }
   //메소드 생성
   public void testInetAddress() throws Exception {
      //예외 처리 (try~catch문도 잇고 메소드에 throws Exception를 붙이는 방법도 잇다)
      ip = InetAddress.getLocalHost();
      System.out.println(ip);   //로컬 호스트 주소 출력
      ip1 = ip.getHostAddress();
      System.out.println(ip1);   //호스트 주소 출력

      System.out.println(ip.getHostName());
      System.out.println(ip.getHostAddress());
      System.out.println(ip.toString());
      System.out.println("---------------------------");
   }
   
   @Override
   public String toString() {   //toString은 설명하는 문
      //return "InetAddressEx00 [ip=" + ip + ", ip1=" + ip1 + "]";
      return "ip주소 확인하는 중 .......";
   }

   public static void main(String [] args) throws Exception {
      InetTest inet = new InetTest();
      System.out.println(inet.toString());
      System.out.println(inet);
   }
}