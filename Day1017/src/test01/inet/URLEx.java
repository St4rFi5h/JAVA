package test01.inet;
import java.net.*;
public class URLEx {

	public static void main(String[]args) {
		URLEx u =new URLEx();
		u.testURLExample("https://www.naver.com");

	}
	public void testURLExample(String urlStr) {


		System.out.println(urlStr);
		URL url;

		try {
			url=new URL(urlStr);
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getHost());
			System.out.println(url.getFile());
			System.out.println(url.toExternalForm());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
