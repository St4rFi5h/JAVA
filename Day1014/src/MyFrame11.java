import javax.swing.JButton;
import javax.swing.JFrame;
public class MyFrame11 extends JFrame {

	static int sum =0 ;
	static int count =0;

	MyFrame11(){
		JButton button = new JButton("10�������� ������");

		setTitle("ù���� ������");
		setSize(400,300);
		setVisible(true);
		this.add(button);
		button.setBounds(30, 170, 122, 30);
		button.addActionListener(event -> {
			sum=sum+1;
			System.out.println(sum);
			if(sum%10==0) {
				for(int i =0; i<100; i++) {
					count+=i;

				}
				System.out.println("���º����̴�");
			}
		});

	}
	public static void main(String[] args) {
		MyFrame11 mf = new MyFrame11();


	}
}
