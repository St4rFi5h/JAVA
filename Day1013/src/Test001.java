
public class Test001 {
///x �ڷ� ���� �� 
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int x =1;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = x;
				x++;

				if(i+j ==4 || i==j) {
				
					sum+=a[i][j];
				}

			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println("");
		}
		System.out.println(sum);
	}

}