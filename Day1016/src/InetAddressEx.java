
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	InetAddress ip = null; 
	String ip1 = null;
	//메소드생성
	public void testInetAddress() throws UnknownHostException {
		ip = InetAddress.getLocalHost();
		System.out.println(ip);// 로컬호스트 주소 출력
		ip1 = ip.getHostAddress();
		System.out.println(ip1);//호스트 주소 출력
		
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());
		System.out.println("========================");
	}
	
	@Override
	public String toString() {
		//return "InetAddressEx [ip=" + ip + ", ip1=" + ip1 + "]";
		return "ip주소 확인하는중";
	}

	public static void main(String args[])throws Exception {
		InetAddressEx inet = new InetAddressEx();
		inet.testInetAddress();
		System.out.println(inet.toString());
	}
}
