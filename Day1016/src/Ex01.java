
public class Ex01 {
	public static void main(String[]args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";

		if(strVar1 == strVar2) {  ///�ּ� 
			System.out.println("����");

		}else { System.out.println("�ٸ�");
		}

		if(strVar1.equals (strVar2)) {   ///���ڸ��
			System.out.println("����");

		}else { System.out.println("�ٸ�");
		}
	}

}
