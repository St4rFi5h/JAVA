import java.util.Scanner;
public class Practice {
	int color ; 
	String strColor;
	Scanner s = new Scanner (System.in);


	public Practice(){
		strColor="�ʱⰪ";
		color = 1;
				

	}
	
	
	public void Practice(String n , int a) {
		this.strColor = n;
		this.color = a;
		//return��?
}
	
	public void Practice(String n) {
		this.strColor = n;
	
}
	

	public void print() {
			System.out.println(strColor);
	}
	
	


	public static void main(String[] args) {
		Practice pr = new Practice ();
		System.out.println(pr.color);
		System.out.println(pr.strColor);
		pr.color=
		
		
	}
}




