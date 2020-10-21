package test06.generics04;
import java.util.ArrayList;



class DBox<L,R >extends Object{
	private L left;
	private R right;


	public void set(L o, R r) {
		left = o;
		right = r;
	}
	//@override
	public String toString() {
		return left+"&"+right;
	}

}
class MultiTypeParam {
	public static void main (String[]args) {
		DBox<String,Integer> box;
		box = new DBox<String,Integer>();
		box.set("Apple",25);
		System.out.println(box.toString());

		ArrayList<DBox> arr = new ArrayList<DBox>();
		arr.add(box);
		System.out.println(arr.get(0));
	}
}
