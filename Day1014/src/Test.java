interface Show{
	public void show();
	public void count(); ////이게있을거면
}

class Test1 implements Show {
	public void show() {
		System.out.println("show 실행"); 
	}
	
	
	public void count() { }  //이런 빈거라도 하나 더필요하다
}

	public class Test{
		public static void main(String[]args) 
		{

			Test1 t = new Test1();
			t.show();

			Show s = new Show() {
				public void show() {
					System.out.println("무명클래스 show 실행");
				}
			};
			s.show();
		}
	}


