package toString;

public class Cloths
{
	String color;
	String size;
	int cost;
	Cloths(String color, int cost, String size)
	{
		this.color=color;
		this.cost=cost;
		this.size=size;
	}
	public String toString() {
		return this.color+" "+this.size+" "+this.cost;
	}
	public static void main(String[] args)
	{
		Cloths m1=new Cloths("pink",500000,"XL" );
		System.out.println(m1.toString());
	}
}
