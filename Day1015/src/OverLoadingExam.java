import java.util.Scanner;
public class OverLoadingExam {
			int color;
			String strColor;
			Scanner s = new Scanner(System.in);
			
			
			public OverLoadingExam() {
				this.color=3;
				this.strColor="red";
			}
			
			public void setColor(int color) {
				this.color=color;
				System.out.println(this.color);
				
			}
			
			 public void setColor(String color) {
					this.strColor=strColor;
				System.out.println(this.strColor);
				
			}
			
			
	public static void main(String[] args) {
		OverLoadingExam or = new OverLoadingExam();
		System.out.println(or.color+or.strColor);
		or.setColor(20);
		or.setColor("Red");
		System.out.println(or.color+or.strColor);

	}

}
