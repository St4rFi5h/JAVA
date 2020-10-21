package inherit.test;

import access.sampler.Child;
import access.sampler.Parent;

public class TestProtected {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.num = 10 ; //protected
		child.insert();

	}

}
