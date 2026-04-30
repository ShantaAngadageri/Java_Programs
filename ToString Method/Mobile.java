package toString;

public class Mobile
{
	String model_name;
	String color;
	int cost;
	Mobile(String model_name, int cost, String color)
	{
		this.model_name=model_name;
		this.cost=cost;
		this.color=color;
	}
	public String toString() {
		return this.model_name+" "+this.cost+" "+this.color;
	}
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Vivo", 20000, "Silver");
		System.out.println(m1.toString());
	}
}
