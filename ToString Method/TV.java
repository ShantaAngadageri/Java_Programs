package toString;

public class TV
{
	String brand;
	String type;
	int cost;
	TV(String brand, int cost, String type)
	{
		this.brand=brand;
		this.cost=cost;
		this.type=type;
	}
	public String toString() {
		return this.brand+" "+this.type+" "+this.cost;
	}
	public static void main(String[] args)
	{
		TV m1=new TV("Sony",50000,"LED" );
		System.out.println(m1.toString());
	}
}
