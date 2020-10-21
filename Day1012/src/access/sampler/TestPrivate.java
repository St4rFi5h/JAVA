package access.sampler;

public class TestPrivate {
	public static void main(String[]args) {
		PrivateSample psamp = new PrivateSample();
		psamp.num = 10;
		psamp.setNum(10);
		System.out.println(psamp.getNum());
	}
}
