package test01.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
   InetAddress ip = null;
   String ip1 = null;
   public void testInetAddressEx00() throws Exception{
      testInetAddress();
   }
   //�޼ҵ� ����
   public void testInetAddress() throws Exception {
      //���� ó�� (try~catch���� �հ� �޼ҵ忡 throws Exception�� ���̴� ����� �մ�)
      ip = InetAddress.getLocalHost();
      System.out.println(ip);   //���� ȣ��Ʈ �ּ� ���
      ip1 = ip.getHostAddress();
      System.out.println(ip1);   //ȣ��Ʈ �ּ� ���

      System.out.println(ip.getHostName());
      System.out.println(ip.getHostAddress());
      System.out.println(ip.toString());
      System.out.println("---------------------------");
   }
   
   @Override
   public String toString() {   //toString�� �����ϴ� ��
      //return "InetAddressEx00 [ip=" + ip + ", ip1=" + ip1 + "]";
      return "ip�ּ� Ȯ���ϴ� �� .......";
   }

   public static void main(String [] args) throws Exception {
      InetTest inet = new InetTest();
      System.out.println(inet.toString());
      System.out.println(inet);
   }
}