package access.sampler;
 
public class PrivateSample {
	//java 파일 에는 public 클래스가 반드시 존재햐아한다
	//소스파일 ㅇ름과 동일한 클래스가 반드시 존재 + public

		private int num;
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num=num;
		}
	}


