
public class Ex01 {
	public static void main(String[]args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";

		if(strVar1 == strVar2) {  ///주소 
			System.out.println("같음");

		}else { System.out.println("다른");
		}

		if(strVar1.equals (strVar2)) {   ///문자모양
			System.out.println("같음");

		}else { System.out.println("다른");
		}
	}

}
