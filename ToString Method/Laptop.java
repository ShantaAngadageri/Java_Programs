package toString;

public class Laptop
{
	String name;
	String brand;
	int cost;
	Laptop(String name, int cost, String brand)
	{
		this.name=name;
		this.cost=cost;
		this.brand=brand;
	}
	public String toString() {
		return this.name+" "+this.brand+" "+this.cost;
	}
	public static void main(String[] args)
	{
		Laptop m1=new Laptop("Lenovo",40000,"Thinkpad" );
		System.out.println(m1.toString());
		
	}
}
