
public class Arraytest2 {


	///x 자로 더한 값 
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int x = 1;
		int b =1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = x;
				x++;
				if( a[i][j] > 5) {
					a[i][j]=0;
				}
			}
			if(x>=5) {
				x=1;
			}
			x+=b;
			b++;
		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println("");
		}
	}
}
