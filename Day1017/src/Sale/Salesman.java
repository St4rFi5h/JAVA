package Sale;
import java.util.Scanner;
public class Salesman {
	double sales;
	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

		public Salesman()
		{
			this.sales = 0;

		}

	    public String toString( )
	    {
	       return "(이름 : "+name +"판매금액 : "+sales+")";
	    }

	}
