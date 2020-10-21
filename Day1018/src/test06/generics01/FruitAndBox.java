package test06.generics01;

class Apple {
	public String toString() {
		return "apple";
	}
}


class Orange {
	public String toString() {
		return "Orange";
	}
}


class AppleBox{
	private Apple ap;
	public Apple getAp() {
		return ap;
	}
	public void setAp(Apple ap) {
		this.ap=ap;
	}
}
class OrangeBox{
	private Orange o;

	public Orange getO() {
		return o;
	}

	public void setO(Orange o) {
		this.o = o;
	}


}
class FruitAndBox{
	public static void main(String[]args) {
		//r과일담는 박스생성
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//과일을 박스에 담는다
		aBox.setAp(new Apple());
		oBox.setO(new Orange());
		//박스에서 과일을 꺼낸다.
		Apple ap = aBox.getAp();
		Orange og = oBox.getO();
		
		System.out.println(ap);
		System.out.println(og);
		
	}
}