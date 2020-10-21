package text06.generics08;

	public class StaticEx {
		static int a = 0; //한번 선언하고 끝이라 계속 0 으로 초기화 되지않음
		
		public static void count() {
			a++;
			System.out.println(a);
		}
	public static void main(String[] args) {
	StaticEx s1 = new StaticEx();
	s1.count();
	StaticEx s2 = new StaticEx();
	s2.count();
	System.out.println(s1.a);
	StaticEx s3 = new StaticEx();
	s3.count();
	System.out.println(s1.a);
	}

}
