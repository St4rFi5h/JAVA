
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	InetAddress ip = null; 
	String ip1 = null;
	//�޼ҵ����
	public void testInetAddress() throws UnknownHostException {
		ip = InetAddress.getLocalHost();
		System.out.println(ip);// ����ȣ��Ʈ �ּ� ���
		ip1 = ip.getHostAddress();
		System.out.println(ip1);//ȣ��Ʈ �ּ� ���
		
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());
		System.out.println("========================");
	}
	
	@Override
	public String toString() {
		//return "InetAddressEx [ip=" + ip + ", ip1=" + ip1 + "]";
		return "ip�ּ� Ȯ���ϴ���";
	}

	public static void main(String args[])throws Exception {
		InetAddressEx inet = new InetAddressEx();
		inet.testInetAddress();
		System.out.println(inet.toString());
	}
}