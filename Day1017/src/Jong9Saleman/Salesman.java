package Jong9Saleman;

public class Salesman {
	private String name;
	private int sale;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	Salesman(){
		sale= 0;
	}
	Salesman(String Name, int Sale){
		this.name = Name;
		this.sale = Sale;
	}
}