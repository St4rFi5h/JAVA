interface Show{
	public void show();
	public void count(); ////�̰������Ÿ�
}

class Test1 implements Show {
	public void show() {
		System.out.println("show ����"); 
	}
	
	
	public void count() { }  //�̷� ��Ŷ� �ϳ� ���ʿ��ϴ�
}

	public class Test{
		public static void main(String[]args) 
		{

			Test1 t = new Test1();
			t.show();

			Show s = new Show() {
				public void show() {
					System.out.println("����Ŭ���� show ����");
				}
			};
			s.show();
		}
	}


